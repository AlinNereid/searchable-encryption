import java.util.HashMap;

import org.apache.commons.codec.binary.Base64;

import alin.sske.sSKEEcore.SSKEKeys;
import alin.sske.sSKEEcore.impl.SSKEImpl;



public aspect SSKEAspect {
	pointcut encryptWord(SSKEImpl sske, String word, int position) : call (public String encryptWord(String,int))&& target(sske)
	&& args(word,position);
	
	pointcut decryptWord(SSKEImpl sske, String enWord, int position) : call (public String decryptWord(String,int))&& target(sske)
	&& args(enWord,position);
	
	
	before (SSKEImpl sske, String word, int position) : encryptWord(sske, word, position){
		System.out.println("Will encrypt word  \""+ word + "\" on position "+ position +" with keys "+ sske.getSskekeys());
	}
	
	before (SSKEImpl sske, String enWord,int position) : decryptWord(sske, enWord, position){
		System.out.println("Will decrypt encrypted word  \""+ Base64.encodeBase64String(enWord.getBytes()) + "\" on position "+ position +" with keys "+ sske.getSskekeys());
	}
	after(SSKEImpl sske, String word,int position) returning(String enWord) : decryptWord(sske, word, position){
		System.out.println("Decrypted Word: " + enWord);
	}
	
	HashMap<WordPositionAndKey,String> cache = new HashMap<WordPositionAndKey,String>(); 
	
	String around(SSKEImpl sske, String word,int position) : encryptWord(sske, word, position){
		WordPositionAndKey wordPositionAndKey = new WordPositionAndKey();
		wordPositionAndKey.word = word;
		wordPositionAndKey.keys = sske.getSskekeys();
		wordPositionAndKey.position = position;
		String valueFromCache = cache.get(wordPositionAndKey);
		if(valueFromCache!= null){
			System.out.println("Encrypted Word From CACHE: " + Base64.encodeBase64String(valueFromCache.getBytes()));
			return cache.get(wordPositionAndKey);
		}
		else{
			String rez = proceed(sske, word, position);
			cache.put(wordPositionAndKey, rez);
			System.out.println("Encrypted Word COMPUTED: " + Base64.encodeBase64String(rez.getBytes()));
			return rez;
		}
	}
	public class WordPositionAndKey
	{
		int position;
		String word;
		SSKEKeys keys;
		@Override
		public boolean equals(Object obj) {
			WordPositionAndKey workAndKey = (WordPositionAndKey)obj;
			return word.equals(workAndKey.word) 
					&& keys.equals(workAndKey.keys) && position == workAndKey.position;
		}
		
		@Override
		public int hashCode() {
			return word.hashCode();
		}
		
	}
}

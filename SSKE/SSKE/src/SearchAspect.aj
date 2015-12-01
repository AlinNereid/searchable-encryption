import java.util.Date;
import java.util.List;

import alin.sske.sSKEEcore.impl.SSKEImpl;
import alin.sske.sSKEEcore.impl.TokenSSKE;


public aspect SearchAspect {
	pointcut searchMethod(SSKEImpl sske, List<String> encryptedText,TokenSSKE token) : 
		call(public boolean isWordIn(List<String>, TokenSSKE))&& target(sske) && args(encryptedText,token);
	
	boolean around(SSKEImpl sske, List<String> encryptedText,TokenSSKE token) : searchMethod(sske, encryptedText, token){
		long startTime = new Date().getTime();
		boolean b = proceed(sske,encryptedText,token);
		long finishTime = new Date().getTime();
		System.out.println("Time to search : " + ( finishTime-startTime));
		return b;
	}
}

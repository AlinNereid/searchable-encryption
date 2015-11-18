package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.PseudoRandomFunction;
import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * Created by alin_ on 11/17/2015.
 */
public class PRFImpl extends MinimalEObjectImpl.Container implements PseudoRandomFunction{

    @Override
    public String  generateRandomPiece(String key, String seed) {
        String sha1OfKey = new String(DigestUtils.sha1(key));
        byte[] sha1 = DigestUtils.sha1(sha1OfKey+seed);

        String s = new String(sha1);;
        StringBuilder builder = new StringBuilder(s);
        while (builder.length() < 20) {
            builder.append('0');
        }
        return builder.toString();
    }
}

package com.searchable_encryption.sSKEEcore.impl;

import com.searchable_encryption.sSKEEcore.PseudoRandomGenerator;
import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.security.SecureRandom;

public class PRGImpl extends MinimalEObjectImpl.Container implements PseudoRandomGenerator {

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    private int dimension = 40;

    @Override
    public String generateKey(int position, String key) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] sha1 = DigestUtils.sha1(key + position);
        secureRandom.setSeed(sha1);
        byte b[] = new byte[dimension];
        secureRandom.nextBytes(b);
        return new String(b);
    }
}

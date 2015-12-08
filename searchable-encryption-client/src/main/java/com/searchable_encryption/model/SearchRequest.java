package com.searchable_encryption.model;

import com.searchable_encryption.sSKEEcore.impl.TokenSSKE;
import java.util.List;

public class SearchRequest {

    private List<TokenSSKE> tokens;

    private EncryptionType encryptionType;

    public List<TokenSSKE> getTokens() {
        return tokens;
    }

    public void setTokens(List<TokenSSKE> tokens) {
        this.tokens = tokens;
    }

    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }
}

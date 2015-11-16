package com.searchable_encryption.crypto.encryption;

import com.searchable_encryption.crypto.model.EncryptedResult;

import java.util.List;

public interface TextEncryptor {
    
    EncryptedResult encryptText(List<String> text);
}

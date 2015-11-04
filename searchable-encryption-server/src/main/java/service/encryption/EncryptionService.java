package service.encryption;

import crypto.encryption.TextEncryptor;
import crypto.model.EncryptedResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class EncryptionService {
    
    @Autowired
    private TextEncryptor textEncryptor;
    
    public EncryptedResult encrypt(List<String> text) {
        return textEncryptor.encryptText(text);
    }
}

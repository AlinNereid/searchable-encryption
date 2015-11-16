package crypto.encryption;

import crypto.model.EncryptedResult;
import java.util.List;

public interface TextEncryptor {
    
    EncryptedResult encryptText(List<String> text);
}

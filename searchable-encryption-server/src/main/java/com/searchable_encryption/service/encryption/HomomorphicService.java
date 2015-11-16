package com.searchable_encryption.service.encryption;

import com.searchable_encryption.crypto.fhe.FHE;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.EJB;

public class HomomorphicService {

    @EJB
    private FHE fhe;

    public List<BigInteger> add(List<BigInteger> firstNumber, List<BigInteger> secondNumber) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<BigInteger> add(List<List<BigInteger>> numbers) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<BigInteger> multiply(List<BigInteger> firstNumber, List<BigInteger> secondNumber) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}

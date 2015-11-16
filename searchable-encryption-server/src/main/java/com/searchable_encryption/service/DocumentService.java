package com.searchable_encryption.service;

import com.searchable_encryption.dto.BatchResult;
import com.searchable_encryption.dto.Params;

/**
 * Created by Alexandru on 11/3/2015.
 */
public interface DocumentService {

    BatchResult process(Params inputParams);
}

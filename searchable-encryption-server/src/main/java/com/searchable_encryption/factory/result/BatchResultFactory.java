package com.searchable_encryption.factory.result;

import com.searchable_encryption.dto.BatchResult;

import java.util.Map;


public abstract class BatchResultFactory {
    abstract BatchResult getBatchResult(Map<String,String> entries);
}

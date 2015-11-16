package com.searchable_encryption.factory.params;

import com.searchable_encryption.dto.Params;

import java.util.Map;

public abstract class AbstractParamsFactory {
    abstract Params getParams(Map<String,String> entries);
}

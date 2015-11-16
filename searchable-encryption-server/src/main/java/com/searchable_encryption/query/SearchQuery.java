package com.searchable_encryption.query;

import com.searchable_encryption.dto.QueryResult;

public interface SearchQuery {
    
    QueryResult execute();
}

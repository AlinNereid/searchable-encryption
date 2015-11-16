package com.searchable_encryption.service.search;

import com.searchable_encryption.dto.BatchResult;
import com.searchable_encryption.dto.Params;
import com.searchable_encryption.dto.QueryResult;
import com.searchable_encryption.query.SearchQuery;
import com.searchable_encryption.service.AbstractDocumentService;

/**
 * Created by Alexandru on 11/3/2015.
 */
public abstract class DocumentSearchService extends AbstractDocumentService {

    @Override
    protected BatchResult intermediateProcess(Params inputPams) {
        return null;
    }

    public abstract QueryResult performQuery(SearchQuery searchQuery);
}

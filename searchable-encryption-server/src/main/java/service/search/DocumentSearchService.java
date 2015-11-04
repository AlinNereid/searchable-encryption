package service.search;

import dto.BatchResult;
import dto.Params;
import dto.QueryResult;
import query.SearchQuery;
import service.AbstractDocumentService;

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

package service;

import dto.BatchResult;
import dto.Params;

/**
 * Created by Alexandru on 11/3/2015.
 */
public abstract class AbstractDocumentService implements DocumentService {


    @Override
    public BatchResult process(Params inputParams) {
        return intermediateProcess(inputParams);
    }


    protected abstract BatchResult intermediateProcess(Params inputPams);
}

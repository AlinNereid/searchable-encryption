package service;

import dto.BatchResult;
import dto.Params;

/**
 * Created by Alexandru on 11/3/2015.
 */
public interface DocumentService {

    BatchResult process(Params inputParams);
}

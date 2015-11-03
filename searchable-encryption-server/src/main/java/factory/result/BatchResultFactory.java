package factory.result;

import dto.BatchResult;
import dto.Params;

import java.util.Map;


public abstract class BatchResultFactory {
    abstract BatchResult getBatchResult(Map<String,String> entries);
}

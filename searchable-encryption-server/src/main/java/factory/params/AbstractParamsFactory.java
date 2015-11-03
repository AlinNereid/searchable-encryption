package factory.params;

import dto.Params;

import java.util.Map;

public abstract class AbstractParamsFactory {
    abstract Params getParams(Map<String,String> entries);
}

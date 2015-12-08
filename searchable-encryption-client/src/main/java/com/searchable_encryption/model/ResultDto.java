package com.searchable_encryption.model;

import java.util.List;

/**
 * Created by Alexandru on 12/8/2015.
 */
public class ResultDto {

    private List<String> resultList;


    public ResultDto(){}

    public ResultDto(List<String> resultList){
        this.resultList =resultList;
    }
    public List<String> getResultList() {
        return resultList;
    }

    public ResultDto setResultList(List<String> resultList) {
        this.resultList = resultList;
        return this;
    }

   /* @Override
    public String toString() {
        return "ResultDto{" +
                "resultList=" + resultList +
                '}';
    }*/
}

package com.searchable_encryption.consumer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceConsumer {

    private final RestTemplate restTemplate = new RestTemplate();

    public <T1, T2> T2 postRequest(String url, T1 requestObject, Class<T2> responseClass) {
        HttpEntity<T1> request = new HttpEntity<>(requestObject);

        HttpEntity<T2> response = this.restTemplate.exchange(url, HttpMethod.POST, request, responseClass);

        return response.getBody();
    }
}

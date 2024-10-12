package com.srllc.bountiply.factoryPattern.vendors;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public interface PaymentVendor {
    public void setRequestEntity(Map<String, String> headerMap);

    public void setHttpMethod(String method); // note: can be enum in the future (HttpMethod)

    public void setTargetHostName(String targetHostName);

    public void setRequestBody(String requestBody);

    public HttpEntity getHttpEntity();

    public String getHttpMethod();

    public String getHostName();

    public String getRequestBody();

    // New method to handle the response from the payment provider
    void handleResponse(ResponseEntity<?> response);
}   

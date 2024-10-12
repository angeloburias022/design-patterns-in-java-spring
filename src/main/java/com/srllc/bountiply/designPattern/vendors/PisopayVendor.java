package com.srllc.bountiply.factoryPattern.vendors;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class PisopayVendor implements PaymentVendor {
    private String hostName;
    private String httpMethod;
    private HttpEntity httpEntity;
    private String requestBody;

    @Override
    public void setRequestEntity(Map<String, String> headerMap) {
        // Pisopay-specific headers
        this.httpEntity = new HttpEntity<>(headerMap);
    }

    @Override
    public void setHttpMethod(String method) {
        this.httpMethod = method;
    }

    @Override
    public void setTargetHostName(String targetHostName) {
        this.hostName = targetHostName;
    }

    @Override
    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    @Override
    public HttpEntity getHttpEntity() {
        return this.httpEntity;
    }

    @Override
    public String getHttpMethod() {
        return this.httpMethod;
    }

    @Override
    public String getHostName() {
        return this.hostName;
    }

    @Override
    public String getRequestBody() {
        return this.requestBody;
    }

    @Override
    public void handleResponse(ResponseEntity<?> response) {
        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Pisopay Payment Success!");
            System.out.println("Response: " + response.getBody()); // Assuming JSON response for Pisopay
            // Add logic for parsing the JSON and extracting relevant fields
        } else {
            System.out.println("Stripe Payment Failed: " + response.getStatusCode());
        }
    }
}

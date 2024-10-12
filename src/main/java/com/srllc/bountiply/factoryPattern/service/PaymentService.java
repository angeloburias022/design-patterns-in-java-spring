package com.srllc.bountiply.factoryPattern.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.srllc.bountiply.factoryPattern.vendors.PaymentVendor;

public abstract class PaymentService {
    private final RestTemplate restTemplate = new RestTemplate();

    public abstract PaymentVendor createVendor();

    public void processPayment() {
        PaymentVendor vendor = createVendor();

        try {
            System.out.println("Sending payment to " + vendor.getHostName());
            System.out.println("Using HTTP Method: " + vendor.getHttpMethod());
            System.out.println("With Request Body: " + vendor.getRequestBody());

            ResponseEntity<String> response = restTemplate.exchange(
                vendor.getHostName(),
                vendor.getHttpMethod().equalsIgnoreCase("POST") ?
                    org.springframework.http.HttpMethod.POST : org.springframework.http.HttpMethod.GET,
                vendor.getHttpEntity(),
                String.class
            );

            // Delegate response handling to the vendor
            vendor.handleResponse(response);

        } catch (Exception e) {
            System.out.println("Error processing payment: " + e.getMessage());
        }
    }
}

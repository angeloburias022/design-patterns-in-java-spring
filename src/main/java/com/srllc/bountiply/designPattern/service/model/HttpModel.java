package com.srllc.bountiply.designPattern.service.model;

import org.springframework.http.HttpEntity;

// todo 1: add lombok here (GETTERS, SETTERS, ALL ARGS)
public class HttpModel {
    private HttpEntity entity;
    private String hostName;
    private String uri;
    private String httpMethod;
    private String requestBody;
    
}

package com.srllc.bountiply.designPattern.vendors;

import com.srllc.bountiply.designPattern.service.model.HttpModel;

public class PisopayVendor implements PaymentVendor {

    // produce a http model
    // add all logic here for the prepare model for this vendor (PISOPAY)
    // call secrets manager here per vendor 
    // for the meantime: 1 CONST for pisopay_vendor to retrieve DATA FROM secrets manager 
    // mock credential data from aws secret manager 
    // build http model 

    private final static String PISOPAY = "pisopay_vendor"; // secrets_name
    @Override
    public HttpModel prepareModel() {
        HttpModel model = new HttpModel();
        // model.setHostName(getHostName());
        return model;
    }
    
    private String getHostName() {
        return "http://localhost:8080";
    }
  
    public static void main() {
        // run the app here 
        // the http model implement 
    }


}

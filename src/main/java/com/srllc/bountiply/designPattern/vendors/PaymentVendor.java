package com.srllc.bountiply.designPattern.vendors;

import com.srllc.bountiply.designPattern.service.model.HttpModel;

public interface PaymentVendor {
    public HttpModel prepareModel();
}   

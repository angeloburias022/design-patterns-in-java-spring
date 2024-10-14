package com.srllc.bountiply.designPattern.service;

import com.srllc.bountiply.designPattern.vendors.PaymentVendor;
import com.srllc.bountiply.designPattern.vendors.PisopayVendor;

public class PisopayPaymentService extends PaymentService {

    
    // todo 2: add autowired for pisopay vendor
    @Override
    public PaymentVendor createVendor() {
        return new PisopayVendor();
    }
    
}

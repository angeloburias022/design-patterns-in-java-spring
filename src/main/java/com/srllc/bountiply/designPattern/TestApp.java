package com.srllc.bountiply.designPattern;

import com.srllc.bountiply.designPattern.service.PaymentService;
import com.srllc.bountiply.designPattern.service.PisopayPaymentService;

public class TestApp {
    public static void main(String[] args) {
        // Process a Pisopay payment
        PaymentService pisopayService = new PisopayPaymentService();
        pisopayService.processPayment();

   
    }
}

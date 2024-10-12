package com.srllc.bountiply.factoryPattern;

import com.srllc.bountiply.factoryPattern.service.PaymentService;
import com.srllc.bountiply.factoryPattern.service.PisopayPaymentService;

public class TestApp {
    public static void main(String[] args) {
        // Process a Pisopay payment
        PaymentService payPalService = new PisopayPaymentService();
        payPalService.processPayment();

   
    }
}

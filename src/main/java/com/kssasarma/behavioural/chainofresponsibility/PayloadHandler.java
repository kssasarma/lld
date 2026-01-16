package com.kssasarma.behavioural.chainofresponsibility;

public class PayloadHandler implements HandlerChain {
    String payload;

    public HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n Payload: " + payload;
        if (next != null) {
            return next.addHandler(outputHeader);
        }
        return outputHeader;
    }

}

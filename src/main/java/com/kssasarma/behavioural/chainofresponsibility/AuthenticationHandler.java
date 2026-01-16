package com.kssasarma.behavioural.chainofresponsibility;

public class AuthenticationHandler implements HandlerChain {
    String token;

    public HandlerChain next;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n Authentication: Bearer " + token;
        if (next != null) {
            return next.addHandler(outputHeader);
        }
        return outputHeader;
    }

}

package com.kssasarma.behavioural.chainofresponsibility;

public class ContentTypeHandler implements HandlerChain {
    String contentType;

    public HandlerChain next;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n Content-Type: " + contentType;
        if (next != null) {
            return next.addHandler(outputHeader);
        }
        return outputHeader;
    }

}

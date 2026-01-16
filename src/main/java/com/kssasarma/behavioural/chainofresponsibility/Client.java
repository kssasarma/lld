package com.kssasarma.behavioural.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler auth = new AuthenticationHandler("1234567890");
        ContentTypeHandler contentType = new ContentTypeHandler("application/json");
        PayloadHandler payload = new PayloadHandler("{ \"message\": \"Hello, World!\" }");

        auth.next = contentType;
        contentType.next = payload;
        String result = auth.addHandler("POST /api/data HTTP/1.1");
        System.out.println(result);
    }
}

package com.kssasarma.structural.facade;

public class NetworkAccessFacade {

    private Comm comm = new Comm();
    private Convertor convertor = new Convertor();
    private Cache cache = new Cache();
    private interceptor interceptor = new interceptor();

    public void communicate() {

        cache.cache();
        interceptor.intercept();
        comm.send("Data");
        convertor.convert();
        comm.receive();

    }

}

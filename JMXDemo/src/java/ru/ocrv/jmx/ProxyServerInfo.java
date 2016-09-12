package ru.ocrv.jmx;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

public class ProxyServerInfo implements ProxyServerInfoMXBean
{
    private int counter = 0;

    @Override
    public String getProxyVersion() {
        return "Version 1.0.0";
    }

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public void increaseCounter(int i) {
        counter += i;
    }

    @Override
    public ObjectName getObjectName() {
        try {
            return new ObjectName("com.lynden.messaging:type=MessagingProxyClients");
        } catch (MalformedObjectNameException ex) {
            throw new RuntimeException("No such name");
        }
    }

}

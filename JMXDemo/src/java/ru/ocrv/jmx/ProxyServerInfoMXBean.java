package ru.ocrv.jmx;

import java.lang.management.PlatformManagedObject;

public interface ProxyServerInfoMXBean extends PlatformManagedObject
{
    String getProxyVersion();
    int getCounter();
    void increaseCounter(int i);
}

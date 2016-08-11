package patterns;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Patterns
{
    public static void main(String[] args) throws Exception {
        Set<String> list2 = new HashSet<>();
        list2.add("172.22.204.240");
        list2.add("172.22.204.241");
        list2.add("172.22.204.242");
        list2.add("172.22.204.243");
        list2.add("172.22.204.244");
        Set<String> list = getAddresses();
        list.retainAll(list2);
        list.stream().forEach(addr -> System.out.println(addr));
    }

    private static Set<String> getAddresses() throws SocketException {
        Set<String> list = new HashSet<>();
        Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
        while(en.hasMoreElements()) {
            NetworkInterface inter = en.nextElement();
            Enumeration<InetAddress> inet = inter.getInetAddresses();
            while(inet.hasMoreElements()) {
                InetAddress address = inet.nextElement();
                if(address instanceof Inet4Address && !address.isLoopbackAddress()) {
                    list.add(address.getHostAddress());
                }
            }
        }
        return list;
    }

}

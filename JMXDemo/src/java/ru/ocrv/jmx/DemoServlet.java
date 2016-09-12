package ru.ocrv.jmx;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
    protected ProxyServerInfo proxyServerMBean;
    protected String nameString = "com.lynden.messaging:type=MessagingProxyClients";
    protected ObjectName mBeanName;

    @Override
    public void init() throws ServletException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        proxyServerMBean = new ProxyServerInfo();
        try {
            mBeanName = new ObjectName(nameString);
            try {
                mbs.unregisterMBean(mBeanName);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            mbs.registerMBean(proxyServerMBean, mBeanName);
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Object att = ManagementFactory.getPlatformMBeanServer().getAttribute(mBeanName, "Counter");
            System.out.println("VALUE:" + att.toString() + ", Class:" + att.getClass().getCanonicalName() + " ");
            getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

}

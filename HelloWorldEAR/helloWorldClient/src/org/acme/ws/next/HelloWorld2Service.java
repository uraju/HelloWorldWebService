
package org.acme.ws.next;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloWorld2Service", targetNamespace = "http://next.ws.acme.org/", wsdlLocation = "WEB-INF/wsdl/HelloWorld2Service.wsdl")
public class HelloWorld2Service
    extends Service
{

    private final static URL HELLOWORLD2SERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLD2SERVICE_EXCEPTION;
    private final static QName HELLOWORLD2SERVICE_QNAME = new QName("http://next.ws.acme.org/", "HelloWorld2Service");

    static {
            HELLOWORLD2SERVICE_WSDL_LOCATION = org.acme.ws.next.HelloWorld2Service.class.getResource("/WEB-INF/wsdl/HelloWorld2Service.wsdl");
        WebServiceException e = null;
        if (HELLOWORLD2SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/HelloWorld2Service.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        HELLOWORLD2SERVICE_EXCEPTION = e;
    }

    public HelloWorld2Service() {
        super(__getWsdlLocation(), HELLOWORLD2SERVICE_QNAME);
    }

    public HelloWorld2Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLD2SERVICE_QNAME, features);
    }

    public HelloWorld2Service(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLD2SERVICE_QNAME);
    }

    public HelloWorld2Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLD2SERVICE_QNAME, features);
    }

    public HelloWorld2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld2Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorld2
     */
    @WebEndpoint(name = "HelloWorld2Port")
    public HelloWorld2 getHelloWorld2Port() {
        return super.getPort(new QName("http://next.ws.acme.org/", "HelloWorld2Port"), HelloWorld2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld2
     */
    @WebEndpoint(name = "HelloWorld2Port")
    public HelloWorld2 getHelloWorld2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://next.ws.acme.org/", "HelloWorld2Port"), HelloWorld2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLD2SERVICE_EXCEPTION!= null) {
            throw HELLOWORLD2SERVICE_EXCEPTION;
        }
        return HELLOWORLD2SERVICE_WSDL_LOCATION;
    }

}

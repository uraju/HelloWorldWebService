
package org.acme.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloWorldService", targetNamespace = "http://acme.org/wsdl", wsdlLocation = "WEB-INF/wsdl/HelloWorldService.wsdl")
public class HelloWorldService
    extends Service
{

    private final static URL HELLOWORLDSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDSERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVICE_QNAME = new QName("http://acme.org/wsdl", "HelloWorldService");

    static {
            HELLOWORLDSERVICE_WSDL_LOCATION = org.acme.wsdl.HelloWorldService.class.getResource("/WEB-INF/wsdl/HelloWorldService.wsdl");
        WebServiceException e = null;
        if (HELLOWORLDSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/HelloWorldService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        HELLOWORLDSERVICE_EXCEPTION = e;
    }

    public HelloWorldService() {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort() {
        return super.getPort(new QName("http://acme.org/wsdl", "HelloWorldPort"), HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://acme.org/wsdl", "HelloWorldPort"), HelloWorld.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVICE_WSDL_LOCATION;
    }

}

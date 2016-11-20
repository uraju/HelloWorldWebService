
package org.acme.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "CalculatorService", targetNamespace = "http://acme.org/wsdl", wsdlLocation = "WEB-INF/wsdl/CalculatorService.wsdl")
public class CalculatorService
    extends Service
{

    private final static URL CALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORSERVICE_EXCEPTION;
    private final static QName CALCULATORSERVICE_QNAME = new QName("http://acme.org/wsdl", "CalculatorService");

    static {
            CALCULATORSERVICE_WSDL_LOCATION = org.acme.wsdl.CalculatorService.class.getResource("/WEB-INF/wsdl/CalculatorService.wsdl");
        WebServiceException e = null;
        if (CALCULATORSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/CalculatorService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CALCULATORSERVICE_EXCEPTION = e;
    }

    public CalculatorService() {
        super(__getWsdlLocation(), CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORSERVICE_QNAME, features);
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORSERVICE_QNAME, features);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort() {
        return super.getPort(new QName("http://acme.org/wsdl", "CalculatorPort"), CalculatorWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://acme.org/wsdl", "CalculatorPort"), CalculatorWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORSERVICE_EXCEPTION!= null) {
            throw CALCULATORSERVICE_EXCEPTION;
        }
        return CALCULATORSERVICE_WSDL_LOCATION;
    }

}

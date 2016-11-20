
package org.acme.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CalculatorWs", targetNamespace = "http://acme.org/wsdl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWs {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.Sum")
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.SumResponse")
    @Action(input = "http://acme.org/wsdl/CalculatorWs/sumRequest", output = "http://acme.org/wsdl/CalculatorWs/sumResponse")
    public int sum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.MultiplyResponse")
    @Action(input = "http://acme.org/wsdl/CalculatorWs/multiplyRequest", output = "http://acme.org/wsdl/CalculatorWs/multiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}

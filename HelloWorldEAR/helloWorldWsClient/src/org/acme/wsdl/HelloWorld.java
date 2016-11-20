
package org.acme.wsdl;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "HelloWorld", targetNamespace = "http://acme.org/wsdl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<org.acme.wsdl.HelloNameResponse>
     */
    @WebMethod(operationName = "helloName")
    @RequestWrapper(localName = "helloName", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloNameResponse")
    public Response<HelloNameResponse> helloNameAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "helloName")
    @RequestWrapper(localName = "helloName", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloNameResponse")
    public Future<?> helloNameAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<HelloNameResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "helloName", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://acme.org/wsdl", className = "org.acme.wsdl.HelloNameResponse")
    @Action(input = "http://acme.org/wsdl/HelloWorld/helloNameRequest", output = "http://acme.org/wsdl/HelloWorld/helloNameResponse")
    public String helloName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

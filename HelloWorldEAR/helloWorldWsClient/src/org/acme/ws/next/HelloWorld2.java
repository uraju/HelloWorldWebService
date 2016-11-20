
package org.acme.ws.next;

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

@WebService(name = "HelloWorld2", targetNamespace = "http://next.ws.acme.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld2 {


    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<org.acme.ws.next.HelloNameResponse>
     */
    @WebMethod(operationName = "helloName")
    @RequestWrapper(localName = "helloName", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloNameResponse")
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
    @RequestWrapper(localName = "helloName", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloNameResponse")
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
    @RequestWrapper(localName = "helloName", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://next.ws.acme.org/", className = "org.acme.ws.next.HelloNameResponse")
    @Action(input = "http://next.ws.acme.org/HelloWorld2/helloNameRequest", output = "http://next.ws.acme.org/HelloWorld2/helloNameResponse")
    public String helloName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

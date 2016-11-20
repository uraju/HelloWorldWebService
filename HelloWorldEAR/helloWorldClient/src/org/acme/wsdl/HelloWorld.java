
package org.acme.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
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

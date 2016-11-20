package org.acme.wsdl;

import java.net.URL;
import java.util.concurrent.Future;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class CalculatorPortProxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private org.acme.wsdl.CalculatorService _service = null;
        private org.acme.wsdl.CalculatorWs _proxy = null;
        private Dispatch<Source> _dispatch = null;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new org.acme.wsdl.CalculatorService(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            _service = new org.acme.wsdl.CalculatorService();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getCalculatorPort();
        }

        public org.acme.wsdl.CalculatorWs getProxy() {
            return _proxy;
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("", "CalculatorPort");
                _dispatch = _service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

                String proxyEndpointUrl = getEndpoint();
                BindingProvider bp = (BindingProvider) _dispatch;
                String dispatchEndpointUrl = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                if (!dispatchEndpointUrl.equals(proxyEndpointUrl))
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, proxyEndpointUrl);
            }
            return _dispatch;
        }

        public String getEndpoint() {
            BindingProvider bp = (BindingProvider) _proxy;
            return (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        }

        public void setEndpoint(String endpointUrl) {
            BindingProvider bp = (BindingProvider) _proxy;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);

            if (_dispatch != null ) {
                bp = (BindingProvider) _dispatch;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            }
        }

        public void setMTOMEnabled(boolean enable) {
            SOAPBinding binding = (SOAPBinding) ((BindingProvider) _proxy).getBinding();
            binding.setMTOMEnabled(enable);
        }
    }

    public CalculatorPortProxy() {
        _descriptor = new Descriptor();
        _descriptor.setMTOMEnabled(false);
    }

    public CalculatorPortProxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
        _descriptor.setMTOMEnabled(false);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public Response<SumResponse> sumAsync(int arg0, int arg1) {
        return _getDescriptor().getProxy().sumAsync(arg0,arg1);
    }

    public Future<?> sumAsync(int arg0, int arg1, AsyncHandler<SumResponse> asyncHandler) {
        return _getDescriptor().getProxy().sumAsync(arg0,arg1,asyncHandler);
    }

    public int sum(int arg0, int arg1) {
        return _getDescriptor().getProxy().sum(arg0,arg1);
    }

    public Response<MultiplyResponse> multiplyAsync(int arg0, int arg1) {
        return _getDescriptor().getProxy().multiplyAsync(arg0,arg1);
    }

    public Future<?> multiplyAsync(int arg0, int arg1, AsyncHandler<MultiplyResponse> asyncHandler) {
        return _getDescriptor().getProxy().multiplyAsync(arg0,arg1,asyncHandler);
    }

    public int multiply(int arg0, int arg1) {
        return _getDescriptor().getProxy().multiply(arg0,arg1);
    }

}
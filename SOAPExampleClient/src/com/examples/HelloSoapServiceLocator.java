/**
 * HelloSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.examples;

public class HelloSoapServiceLocator extends org.apache.axis.client.Service implements com.examples.HelloSoapService {

    public HelloSoapServiceLocator() {
    }


    public HelloSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloSoap
    private java.lang.String HelloSoap_address = "http://localhost:8080/SOAPExample/services/HelloSoap";

    public java.lang.String getHelloSoapAddress() {
        return HelloSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloSoapWSDDServiceName = "HelloSoap";

    public java.lang.String getHelloSoapWSDDServiceName() {
        return HelloSoapWSDDServiceName;
    }

    public void setHelloSoapWSDDServiceName(java.lang.String name) {
        HelloSoapWSDDServiceName = name;
    }

    public com.examples.HelloSoap getHelloSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloSoap(endpoint);
    }

    public com.examples.HelloSoap getHelloSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.examples.HelloSoapSoapBindingStub _stub = new com.examples.HelloSoapSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloSoapEndpointAddress(java.lang.String address) {
        HelloSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.examples.HelloSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.examples.HelloSoapSoapBindingStub _stub = new com.examples.HelloSoapSoapBindingStub(new java.net.URL(HelloSoap_address), this);
                _stub.setPortName(getHelloSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloSoap".equals(inputPortName)) {
            return getHelloSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://examples.com", "HelloSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://examples.com", "HelloSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloSoap".equals(portName)) {
            setHelloSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

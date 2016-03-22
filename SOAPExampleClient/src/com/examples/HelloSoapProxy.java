package com.examples;

public class HelloSoapProxy implements com.examples.HelloSoap {
  private String _endpoint = null;
  private com.examples.HelloSoap helloSoap = null;
  
  public HelloSoapProxy() {
    _initHelloSoapProxy();
  }
  
  public HelloSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloSoapProxy();
  }
  
  private void _initHelloSoapProxy() {
    try {
      helloSoap = (new com.examples.HelloSoapServiceLocator()).getHelloSoap();
      if (helloSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloSoap != null)
      ((javax.xml.rpc.Stub)helloSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.examples.HelloSoap getHelloSoap() {
    if (helloSoap == null)
      _initHelloSoapProxy();
    return helloSoap;
  }
  
  public java.lang.String sumOfNumbers(int a, int b) throws java.rmi.RemoteException{
    if (helloSoap == null)
      _initHelloSoapProxy();
    return helloSoap.sumOfNumbers(a, b);
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (helloSoap == null)
      _initHelloSoapProxy();
    return helloSoap.sayHello(name);
  }
  
  
}
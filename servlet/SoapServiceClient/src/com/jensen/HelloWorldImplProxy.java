package com.jensen;

public class HelloWorldImplProxy implements com.jensen.HelloWorldImpl {
  private String _endpoint = null;
  private com.jensen.HelloWorldImpl helloWorldImpl = null;
  
  public HelloWorldImplProxy() {
    _initHelloWorldImplProxy();
  }
  
  public HelloWorldImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldImplProxy();
  }
  
  private void _initHelloWorldImplProxy() {
    try {
      helloWorldImpl = (new com.jensen.HelloWorldImplServiceLocator()).getHelloWorldImpl();
      if (helloWorldImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldImpl != null)
      ((javax.xml.rpc.Stub)helloWorldImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jensen.HelloWorldImpl getHelloWorldImpl() {
    if (helloWorldImpl == null)
      _initHelloWorldImplProxy();
    return helloWorldImpl;
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (helloWorldImpl == null)
      _initHelloWorldImplProxy();
    return helloWorldImpl.sayHello();
  }
  
  
}
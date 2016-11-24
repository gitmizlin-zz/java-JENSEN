/**
 * HelloWorldImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jensen;

public interface HelloWorldImplService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldImplAddress();

    public com.jensen.HelloWorldImpl getHelloWorldImpl() throws javax.xml.rpc.ServiceException;

    public com.jensen.HelloWorldImpl getHelloWorldImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

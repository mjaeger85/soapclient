/**
 * OrderDocumentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.orderdocument4.stub;

public class OrderDocumentServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.orderdocument4.stub.OrderDocumentService {

/**
 * epages Order Document Service
 */

    public OrderDocumentServiceLocator() {
    }


    public OrderDocumentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderDocumentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_OrderDocument
    private java.lang.String port_OrderDocument_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_OrderDocumentAddress() {
        return port_OrderDocument_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_OrderDocumentWSDDServiceName = "port_OrderDocument";

    public java.lang.String getport_OrderDocumentWSDDServiceName() {
        return port_OrderDocumentWSDDServiceName;
    }

    public void setport_OrderDocumentWSDDServiceName(java.lang.String name) {
        port_OrderDocumentWSDDServiceName = name;
    }

    public de.epages.ws.orderdocument4.stub.Port_OrderDocument getport_OrderDocument() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_OrderDocument_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_OrderDocument(endpoint);
    }

    public de.epages.ws.orderdocument4.stub.Port_OrderDocument getport_OrderDocument(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.orderdocument4.stub.Bind_OrderDocument_SOAPStub _stub = new de.epages.ws.orderdocument4.stub.Bind_OrderDocument_SOAPStub(portAddress, this);
            _stub.setPortName(getport_OrderDocumentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_OrderDocumentEndpointAddress(java.lang.String address) {
        port_OrderDocument_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.orderdocument4.stub.Port_OrderDocument.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.orderdocument4.stub.Bind_OrderDocument_SOAPStub _stub = new de.epages.ws.orderdocument4.stub.Bind_OrderDocument_SOAPStub(new java.net.URL(port_OrderDocument_address), this);
                _stub.setPortName(getport_OrderDocumentWSDDServiceName());
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
        if ("port_OrderDocument".equals(inputPortName)) {
            return getport_OrderDocument();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentService/2008/05", "OrderDocumentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentService/2008/05", "port_OrderDocument"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_OrderDocument".equals(portName)) {
            setport_OrderDocumentEndpointAddress(address);
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

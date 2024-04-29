
package com.miempresa.servicio.impl.consumo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioWebService", targetNamespace = "http://impl.servicio.miempresa.com/", wsdlLocation = "http://localhost:8080/ProyectoAsistenciaColegio/ServicioWeb?wsdl")
public class ServicioWebService
    extends Service
{

    private final static URL SERVICIOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOWEBSERVICE_EXCEPTION;
    private final static QName SERVICIOWEBSERVICE_QNAME = new QName("http://impl.servicio.miempresa.com/", "ServicioWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoAsistenciaColegio/ServicioWeb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOWEBSERVICE_WSDL_LOCATION = url;
        SERVICIOWEBSERVICE_EXCEPTION = e;
    }

    public ServicioWebService() {
        super(__getWsdlLocation(), SERVICIOWEBSERVICE_QNAME);
    }

    public ServicioWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOWEBSERVICE_QNAME, features);
    }

    public ServicioWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOWEBSERVICE_QNAME);
    }

    public ServicioWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOWEBSERVICE_QNAME, features);
    }

    public ServicioWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioWeb
     */
    @WebEndpoint(name = "ServicioWebPort")
    public ServicioWeb getServicioWebPort() {
        return super.getPort(new QName("http://impl.servicio.miempresa.com/", "ServicioWebPort"), ServicioWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioWeb
     */
    @WebEndpoint(name = "ServicioWebPort")
    public ServicioWeb getServicioWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.servicio.miempresa.com/", "ServicioWebPort"), ServicioWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOWEBSERVICE_EXCEPTION!= null) {
            throw SERVICIOWEBSERVICE_EXCEPTION;
        }
        return SERVICIOWEBSERVICE_WSDL_LOCATION;
    }

}

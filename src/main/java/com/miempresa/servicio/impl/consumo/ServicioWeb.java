
package com.miempresa.servicio.impl.consumo;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioWeb", targetNamespace = "http://impl.servicio.miempresa.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioWeb {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saludar", targetNamespace = "http://impl.servicio.miempresa.com/", className = "com.miempresa.servicio.impl.Saludar")
    @ResponseWrapper(localName = "saludarResponse", targetNamespace = "http://impl.servicio.miempresa.com/", className = "com.miempresa.servicio.impl.SaludarResponse")
    public String saludar();

}


package ru.javacourse.webservice;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SayHelloServiceService", targetNamespace = "http://webservice.javacourse.ru/", wsdlLocation = "http://localhost:8080/sayHello/SayHelloService?wsdl")
public class SayHelloServiceService
    extends Service
{

    private final static URL SAYHELLOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SAYHELLOSERVICESERVICE_EXCEPTION;
    private final static QName SAYHELLOSERVICESERVICE_QNAME = new QName("http://webservice.javacourse.ru/", "SayHelloServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/sayHello/SayHelloService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAYHELLOSERVICESERVICE_WSDL_LOCATION = url;
        SAYHELLOSERVICESERVICE_EXCEPTION = e;
    }

    public SayHelloServiceService() {
        super(__getWsdlLocation(), SAYHELLOSERVICESERVICE_QNAME);
    }

    public SayHelloServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAYHELLOSERVICESERVICE_QNAME, features);
    }

    public SayHelloServiceService(URL wsdlLocation) {
        super(wsdlLocation, SAYHELLOSERVICESERVICE_QNAME);
    }

    public SayHelloServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAYHELLOSERVICESERVICE_QNAME, features);
    }

    public SayHelloServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayHelloServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SayHelloService
     */
    @WebEndpoint(name = "SayHelloServicePort")
    public SayHelloService getSayHelloServicePort() {
        return super.getPort(new QName("http://webservice.javacourse.ru/", "SayHelloServicePort"), SayHelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayHelloService
     */
    @WebEndpoint(name = "SayHelloServicePort")
    public SayHelloService getSayHelloServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.javacourse.ru/", "SayHelloServicePort"), SayHelloService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAYHELLOSERVICESERVICE_EXCEPTION!= null) {
            throw SAYHELLOSERVICESERVICE_EXCEPTION;
        }
        return SAYHELLOSERVICESERVICE_WSDL_LOCATION;
    }

}

package com.backMh.introduce.CXFServe.service.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.backMh.introduce.CXFServe.service.IIntroduceXmlService;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-05T14:44:16.265+08:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "IntroduceXmlServiceService", 
                  wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/introduce/IntroduceXmlService?wsdl",
                  targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/") 
public class IntroduceXmlServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.introduce.logic.webservice.general.zfsoft.com/", "IntroduceXmlServiceService");
    public final static QName IntroduceXmlServicePort = new QName("http://service.introduce.logic.webservice.general.zfsoft.com/", "IntroduceXmlServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.19.191:9992/zfmcmh/webservices/introduce/IntroduceXmlService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IntroduceXmlServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.71.19.191:9992/zfmcmh/webservices/introduce/IntroduceXmlService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IntroduceXmlServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IntroduceXmlServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntroduceXmlServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IIntroduceXmlService
     */
    @WebEndpoint(name = "IntroduceXmlServicePort")
    public IIntroduceXmlService getIntroduceXmlServicePort() {
        return super.getPort(IntroduceXmlServicePort, IIntroduceXmlService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IIntroduceXmlService
     */
    @WebEndpoint(name = "IntroduceXmlServicePort")
    public IIntroduceXmlService getIntroduceXmlServicePort(WebServiceFeature... features) {
        return super.getPort(IntroduceXmlServicePort, IIntroduceXmlService.class, features);
    }

}

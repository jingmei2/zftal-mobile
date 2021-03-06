package com.backMh.notice.CXFService.service.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.backMh.notice.CXFService.service.INoticeXmlService;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T10:15:37.062+08:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "NoticeXmlServiceService", 
                  wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/notice/NoticeXmlService?wsdl",
                  targetNamespace = "http://service.notice.sys.webservice.general.zfsoft.com/") 
public class NoticeXmlServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.notice.sys.webservice.general.zfsoft.com/", "NoticeXmlServiceService");
    public final static QName NoticeXmlServicePort = new QName("http://service.notice.sys.webservice.general.zfsoft.com/", "NoticeXmlServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.19.191:9992/zfmcmh/webservices/notice/NoticeXmlService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(NoticeXmlServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.71.19.191:9992/zfmcmh/webservices/notice/NoticeXmlService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public NoticeXmlServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NoticeXmlServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NoticeXmlServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns INoticeXmlService
     */
    @WebEndpoint(name = "NoticeXmlServicePort")
    public INoticeXmlService getNoticeXmlServicePort() {
        return super.getPort(NoticeXmlServicePort, INoticeXmlService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns INoticeXmlService
     */
    @WebEndpoint(name = "NoticeXmlServicePort")
    public INoticeXmlService getNoticeXmlServicePort(WebServiceFeature... features) {
        return super.getPort(NoticeXmlServicePort, INoticeXmlService.class, features);
    }

}

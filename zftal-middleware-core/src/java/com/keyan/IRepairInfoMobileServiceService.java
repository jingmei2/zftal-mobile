package com.keyan;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-31T15:38:13.555+08:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "IRepairInfoMobileServiceService",
                  wsdlLocation = "http://10.71.33.70:8089/zfwebservice/repairInfoMobileService?wsdl",
                  targetNamespace = "http://service.hq.portal.webservice.zfsoft.com/")
public class IRepairInfoMobileServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.hq.portal.webservice.zfsoft.com/", "IRepairInfoMobileServiceService");
    public final static QName IRepairInfoMobileServicePort = new QName("http://service.hq.portal.webservice.zfsoft.com/", "IRepairInfoMobileServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.33.70:8089/zfwebservice/repairInfoMobileService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IRepairInfoMobileServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.71.33.70:8089/zfwebservice/repairInfoMobileService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IRepairInfoMobileServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IRepairInfoMobileServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IRepairInfoMobileServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public IRepairInfoMobileServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    public IRepairInfoMobileServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    public IRepairInfoMobileServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }




    /**
     *
     * @return
     *     returns IRepairInfoMobileService
     */
    @WebEndpoint(name = "IRepairInfoMobileServicePort")
    public IRepairInfoMobileService getIRepairInfoMobileServicePort() {
        return super.getPort(IRepairInfoMobileServicePort, IRepairInfoMobileService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRepairInfoMobileService
     */
    @WebEndpoint(name = "IRepairInfoMobileServicePort")
    public IRepairInfoMobileService getIRepairInfoMobileServicePort(WebServiceFeature... features) {
        return super.getPort(IRepairInfoMobileServicePort, IRepairInfoMobileService.class, features);
    }

}

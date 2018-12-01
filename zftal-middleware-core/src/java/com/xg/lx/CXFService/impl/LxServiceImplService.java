package com.xg.lx.CXFService.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.xg.lx.CXFService.ILxService;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-10-30T14:46:51.066+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "LxServiceImplService", 
                  wsdlLocation = "http://10.71.32.69:8888/zfxg-ws-web/lxService?wsdl",
                  targetNamespace = "http://impl.service.lx.xgws.zfsoft.com/") 
public class LxServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.lx.xgws.zfsoft.com/", "LxServiceImplService");
    public final static QName LxServiceImplPort = new QName("http://impl.service.lx.xgws.zfsoft.com/", "LxServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.32.69:8888/zfxg-ws-web/lxService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LxServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.71.32.69:8888/zfxg-ws-web/lxService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LxServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LxServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LxServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
 /*   public LxServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LxServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LxServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }*/

    /**
     *
     * @return
     *     returns ILxService
     */
    @WebEndpoint(name = "LxServiceImplPort")
    public ILxService getLxServiceImplPort() {
        return super.getPort(LxServiceImplPort, ILxService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILxService
     */
    @WebEndpoint(name = "LxServiceImplPort")
    public ILxService getLxServiceImplPort(WebServiceFeature... features) {
        return super.getPort(LxServiceImplPort, ILxService.class, features);
    }

}

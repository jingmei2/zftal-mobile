
package com.versionVerify.CXFServe;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-16T11:51:36.921+08:00
 * Generated source version: 2.6.0
 * 
 */
 
public class IVersionVerifyXmlService_VersionVerifyXmlServicePort_Server{

    protected IVersionVerifyXmlService_VersionVerifyXmlServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new IVersionVerifyXmlServiceImpl();
        String address = "http://localhost:8888/zfmobile_versionMB/webservice/version/VersionVerifyXmlService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new IVersionVerifyXmlService_VersionVerifyXmlServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}

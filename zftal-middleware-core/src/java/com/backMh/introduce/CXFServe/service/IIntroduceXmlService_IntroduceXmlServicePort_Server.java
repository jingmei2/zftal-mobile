
package com.backMh.introduce.CXFServe.service;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-05T14:44:16.265+08:00
 * Generated source version: 2.5.2
 * 
 */
 
public class IIntroduceXmlService_IntroduceXmlServicePort_Server{

    protected IIntroduceXmlService_IntroduceXmlServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new IIntroduceXmlServiceImpl();
        String address = "http://10.71.19.191:9992/zfmcmh/webservices/introduce/IntroduceXmlService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new IIntroduceXmlService_IntroduceXmlServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}

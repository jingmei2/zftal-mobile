package com.jw.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-08-07T16:52:16.774+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ICampus")
@XmlSeeAlso({ObjectFactory.class})
public interface ICampus {

    @WebResult(name = "CampusInfoResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICampus/CampusInfo", output = "http://tempuri.org/ICampus/CampusInfoResponse")
    @RequestWrapper(localName = "CampusInfo", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CampusInfo")
    @WebMethod(operationName = "CampusInfo", action = "http://tempuri.org/ICampus/CampusInfo")
    @ResponseWrapper(localName = "CampusInfoResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CampusInfoResponse")
    public java.lang.String campusInfo();
}

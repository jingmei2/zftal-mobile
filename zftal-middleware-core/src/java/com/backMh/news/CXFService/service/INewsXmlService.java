package com.backMh.news.CXFService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T09:49:02.171+08:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", name = "INewsXmlService")
@XmlSeeAlso({ObjectFactory.class})
public interface INewsXmlService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getNewsInfo", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetNewsInfo")
    @WebMethod
    @ResponseWrapper(localName = "getNewsInfoResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetNewsInfoResponse")
    public java.lang.String getNewsInfo(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllNewsTypeList", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetAllNewsTypeList")
    @WebMethod
    @ResponseWrapper(localName = "getAllNewsTypeListResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetAllNewsTypeListResponse")
    public java.lang.String getAllNewsTypeList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTypeNewsPageList", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeNewsPageList")
    @WebMethod
    @ResponseWrapper(localName = "getTypeNewsPageListResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeNewsPageListResponse")
    public java.lang.String getTypeNewsPageList(
        @WebParam(name = "newtype", targetNamespace = "")
        java.lang.String newtype,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTypeIdNewsPageList", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeIdNewsPageList")
    @WebMethod
    @ResponseWrapper(localName = "getTypeIdNewsPageListResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeIdNewsPageListResponse")
    public java.lang.String getTypeIdNewsPageList(
        @WebParam(name = "tid", targetNamespace = "")
        java.lang.String tid,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getIndexNewsList", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetIndexNewsList")
    @WebMethod
    @ResponseWrapper(localName = "getIndexNewsListResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetIndexNewsListResponse")
    public java.lang.String getIndexNewsList(
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getIndexNewsListNew", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetIndexNewsListNew")
    @WebMethod
    @ResponseWrapper(localName = "getIndexNewsListNewResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetIndexNewsListNewResponse")
    public java.lang.String getIndexNewsListNew(
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTypeIdNewsPageListNew", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeIdNewsPageListNew")
    @WebMethod
    @ResponseWrapper(localName = "getTypeIdNewsPageListNewResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeIdNewsPageListNewResponse")
    public java.lang.String getTypeIdNewsPageListNew(
        @WebParam(name = "tid", targetNamespace = "")
        java.lang.String tid,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTypeNewsPageListNew", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeNewsPageListNew")
    @WebMethod
    @ResponseWrapper(localName = "getTypeNewsPageListNewResponse", targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/", className = "com.backMh.news.CXFService.service.GetTypeNewsPageListNewResponse")
    public java.lang.String getTypeNewsPageListNew(
        @WebParam(name = "newtype", targetNamespace = "")
        java.lang.String newtype,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );
}
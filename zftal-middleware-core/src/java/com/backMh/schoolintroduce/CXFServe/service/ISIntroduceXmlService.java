package com.backMh.schoolintroduce.CXFServe.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-21T13:47:33.140+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", name = "ISIntroduceXmlService")
@XmlSeeAlso({ObjectFactory.class})
public interface ISIntroduceXmlService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getRootSchoolIntroduceTypeList", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetRootSchoolIntroduceTypeList")
    @WebMethod
    @ResponseWrapper(localName = "getRootSchoolIntroduceTypeListResponse", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetRootSchoolIntroduceTypeListResponse")
    public java.lang.String getRootSchoolIntroduceTypeList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getSchoolIntroduceById", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetSchoolIntroduceById")
    @WebMethod
    @ResponseWrapper(localName = "getSchoolIntroduceByIdResponse", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetSchoolIntroduceByIdResponse")
    public java.lang.String getSchoolIntroduceById(
        @WebParam(name = "tid", targetNamespace = "")
        java.lang.String tid
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getSchoolIntroduceTitleList", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetSchoolIntroduceTitleList")
    @WebMethod
    @ResponseWrapper(localName = "getSchoolIntroduceTitleListResponse", targetNamespace = "http://service.schoolintroduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.schoolintroduce.CXFServe.service.GetSchoolIntroduceTitleListResponse")
    public java.lang.String getSchoolIntroduceTitleList(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );
}

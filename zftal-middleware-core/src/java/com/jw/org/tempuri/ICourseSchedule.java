package com.jw.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-08-07T16:52:16.790+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ICourseSchedule")
@XmlSeeAlso({ObjectFactory.class})
public interface ICourseSchedule {

    @WebResult(name = "TJCourseScheduleSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICourseSchedule/TJCourseScheduleSearch", output = "http://tempuri.org/ICourseSchedule/TJCourseScheduleSearchResponse")
    @RequestWrapper(localName = "TJCourseScheduleSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJCourseScheduleSearch")
    @WebMethod(operationName = "TJCourseScheduleSearch", action = "http://tempuri.org/ICourseSchedule/TJCourseScheduleSearch")
    @ResponseWrapper(localName = "TJCourseScheduleSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJCourseScheduleSearchResponse")
    public java.lang.String tjCourseScheduleSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "CourseScheduleSearch_WXResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICourseSchedule/CourseScheduleSearch_WX", output = "http://tempuri.org/ICourseSchedule/CourseScheduleSearch_WXResponse")
    @RequestWrapper(localName = "CourseScheduleSearch_WX", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CourseScheduleSearchWX")
    @WebMethod(operationName = "CourseScheduleSearch_WX", action = "http://tempuri.org/ICourseSchedule/CourseScheduleSearch_WX")
    @ResponseWrapper(localName = "CourseScheduleSearch_WXResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CourseScheduleSearchWXResponse")
    public java.lang.String courseScheduleSearchWX(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        java.lang.String username,
        @WebParam(name = "starttime", targetNamespace = "http://tempuri.org/")
        java.lang.String starttime,
        @WebParam(name = "endtime", targetNamespace = "http://tempuri.org/")
        java.lang.String endtime
    );

    @WebResult(name = "TJAllCourseScheduleSearch1Result", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearch1", output = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearch1Response")
    @RequestWrapper(localName = "TJAllCourseScheduleSearch1", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJAllCourseScheduleSearch1")
    @WebMethod(operationName = "TJAllCourseScheduleSearch1", action = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearch1")
    @ResponseWrapper(localName = "TJAllCourseScheduleSearch1Response", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJAllCourseScheduleSearch1Response")
    public java.lang.String tjAllCourseScheduleSearch1(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "TJAllCourseScheduleSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearch", output = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearchResponse")
    @RequestWrapper(localName = "TJAllCourseScheduleSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJAllCourseScheduleSearch")
    @WebMethod(operationName = "TJAllCourseScheduleSearch", action = "http://tempuri.org/ICourseSchedule/TJAllCourseScheduleSearch")
    @ResponseWrapper(localName = "TJAllCourseScheduleSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.TJAllCourseScheduleSearchResponse")
    public java.lang.String tjAllCourseScheduleSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "CourseScheduleSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ICourseSchedule/CourseScheduleSearch", output = "http://tempuri.org/ICourseSchedule/CourseScheduleSearchResponse")
    @RequestWrapper(localName = "CourseScheduleSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CourseScheduleSearch")
    @WebMethod(operationName = "CourseScheduleSearch", action = "http://tempuri.org/ICourseSchedule/CourseScheduleSearch")
    @ResponseWrapper(localName = "CourseScheduleSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.CourseScheduleSearchResponse")
    public java.lang.String courseScheduleSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "role", targetNamespace = "http://tempuri.org/")
        java.lang.String role,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );
}

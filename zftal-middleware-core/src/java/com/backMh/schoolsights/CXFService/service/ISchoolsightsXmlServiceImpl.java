
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.backMh.schoolsights.CXFService.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T11:09:42.453+08:00
 * Generated source version: 2.5.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "SchoolsightsXmlServiceService",
                      portName = "SchoolsightsXmlServicePort",
                      targetNamespace = "http://service.schoolsights.logic.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/schoolsights/SchoolsightsXmlService?wsdl",
                      endpointInterface = "com.backMh.schoolsights.CXFService.service.ISchoolsightsXmlService")
                      
public class ISchoolsightsXmlServiceImpl implements ISchoolsightsXmlService {

    private static final Logger LOG = Logger.getLogger(ISchoolsightsXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.schoolsights.service.ISchoolsightsXmlService#getAllSchoolTypeList(*
     */
    public java.lang.String getAllSchoolTypeList() { 
        LOG.info("Executing operation getAllSchoolTypeList");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.schoolsights.service.ISchoolsightsXmlService#getTypeSchoolSightsPageList(java.lang.String  tid ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeSchoolSightsPageList(java.lang.String tid,int start,int size) { 
        LOG.info("Executing operation getTypeSchoolSightsPageList");
        System.out.println(tid);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.schoolsights.service.ISchoolsightsXmlService#getTypeSchoolSightsPageListNew(java.lang.String  tid ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeSchoolSightsPageListNew(java.lang.String tid,int start,int size) { 
        LOG.info("Executing operation getTypeSchoolSightsPageListNew");
        System.out.println(tid);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}


package com.xg.xg.CXFService;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.0
 * 2017-08-03T14:21:20.980+08:00
 * Generated source version: 2.6.0
 */

@WebFault(name = "ZfxgWsException", targetNamespace = "http://xtwh.xgxt.ws.xgxtws.zfsoft.com/")
public class ZfxgWsException_Exception extends Exception {
    
    private com.xg.xg.CXFService.ZfxgWsException zfxgWsException;

    public ZfxgWsException_Exception() {
        super();
    }
    
    public ZfxgWsException_Exception(String message) {
        super(message);
    }
    
    public ZfxgWsException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ZfxgWsException_Exception(String message, com.xg.xg.CXFService.ZfxgWsException zfxgWsException) {
        super(message);
        this.zfxgWsException = zfxgWsException;
    }

    public ZfxgWsException_Exception(String message, com.xg.xg.CXFService.ZfxgWsException zfxgWsException, Throwable cause) {
        super(message, cause);
        this.zfxgWsException = zfxgWsException;
    }

    public com.xg.xg.CXFService.ZfxgWsException getFaultInfo() {
        return this.zfxgWsException;
    }
}

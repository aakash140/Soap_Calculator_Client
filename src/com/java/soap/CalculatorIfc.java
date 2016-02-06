
package com.java.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorIfc", targetNamespace = "http://soap.java.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorIfc {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://soap.java.com/", className = "com.java.soap.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://soap.java.com/", className = "com.java.soap.AddResponse")
    @Action(input = "http://soap.java.com/CalculatorIfc/addRequest", output = "http://soap.java.com/CalculatorIfc/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://soap.java.com/", className = "com.java.soap.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://soap.java.com/", className = "com.java.soap.DivideResponse")
    @Action(input = "http://soap.java.com/CalculatorIfc/divideRequest", output = "http://soap.java.com/CalculatorIfc/divideResponse")
    public float divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://soap.java.com/", className = "com.java.soap.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://soap.java.com/", className = "com.java.soap.SubtractResponse")
    @Action(input = "http://soap.java.com/CalculatorIfc/subtractRequest", output = "http://soap.java.com/CalculatorIfc/subtractResponse")
    public int subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://soap.java.com/", className = "com.java.soap.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://soap.java.com/", className = "com.java.soap.MultiplyResponse")
    @Action(input = "http://soap.java.com/CalculatorIfc/multiplyRequest", output = "http://soap.java.com/CalculatorIfc/multiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}

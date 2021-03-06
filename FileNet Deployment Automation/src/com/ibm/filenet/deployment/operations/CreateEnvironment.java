//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.08 at 11:54:51 AM EEST 
//


package com.ibm.filenet.deployment.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ibm.filenet.deployment.xml.Connection;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}Connection" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="testConnection" type="{}boolean" default="true" />
 *       &lt;attribute name="storePassword" type="{}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "CreateEnvironment")
public class CreateEnvironment implements IOperation {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Connection")
    protected Connection connection;
    @XmlAttribute(name = "testConnection")
    protected String testConnection;
    @XmlAttribute(name = "storePassword")
    protected String storePassword;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the testConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestConnection() {
        if (testConnection == null) {
            return "true";
        } else {
            return testConnection;
        }
    }

    /**
     * Sets the value of the testConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestConnection(String value) {
        this.testConnection = value;
    }

    /**
     * Gets the value of the storePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePassword() {
        if (storePassword == null) {
            return "false";
        } else {
            return storePassword;
        }
    }

    /**
     * Sets the value of the storePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorePassword(String value) {
        this.storePassword = value;
    }

}

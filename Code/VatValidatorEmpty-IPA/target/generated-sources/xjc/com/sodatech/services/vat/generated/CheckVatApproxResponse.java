//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.04.29 um 01:49:00 PM CEST 
//


package com.sodatech.services.vat.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="traderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traderNameMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/&gt;
 *         &lt;element name="traderCompanyTypeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/&gt;
 *         &lt;element name="traderStreetMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/&gt;
 *         &lt;element name="traderPostcodeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/&gt;
 *         &lt;element name="traderCityMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/&gt;
 *         &lt;element name="requestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryCode",
    "vatNumber",
    "requestDate",
    "valid",
    "traderName",
    "traderCompanyType",
    "traderAddress",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "traderNameMatch",
    "traderCompanyTypeMatch",
    "traderStreetMatch",
    "traderPostcodeMatch",
    "traderCityMatch",
    "requestIdentifier"
})
@XmlRootElement(name = "checkVatApproxResponse")
public class CheckVatApproxResponse {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    protected boolean valid;
    @XmlElementRef(name = "traderName", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderName;
    @XmlElementRef(name = "traderCompanyType", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderCompanyType;
    protected String traderAddress;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String traderNameMatch;
    protected String traderCompanyTypeMatch;
    protected String traderStreetMatch;
    protected String traderPostcodeMatch;
    protected String traderCityMatch;
    @XmlElement(required = true)
    protected String requestIdentifier;

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der vatNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Legt den Wert der vatNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Ruft den Wert der requestDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Legt den Wert der requestDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Ruft den Wert der valid-Eigenschaft ab.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Legt den Wert der valid-Eigenschaft fest.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Ruft den Wert der traderName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderName() {
        return traderName;
    }

    /**
     * Legt den Wert der traderName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderName(JAXBElement<String> value) {
        this.traderName = value;
    }

    /**
     * Ruft den Wert der traderCompanyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Legt den Wert der traderCompanyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderCompanyType(JAXBElement<String> value) {
        this.traderCompanyType = value;
    }

    /**
     * Ruft den Wert der traderAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderAddress() {
        return traderAddress;
    }

    /**
     * Legt den Wert der traderAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderAddress(String value) {
        this.traderAddress = value;
    }

    /**
     * Ruft den Wert der traderStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreet() {
        return traderStreet;
    }

    /**
     * Legt den Wert der traderStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreet(String value) {
        this.traderStreet = value;
    }

    /**
     * Ruft den Wert der traderPostcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcode() {
        return traderPostcode;
    }

    /**
     * Legt den Wert der traderPostcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcode(String value) {
        this.traderPostcode = value;
    }

    /**
     * Ruft den Wert der traderCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCity() {
        return traderCity;
    }

    /**
     * Legt den Wert der traderCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCity(String value) {
        this.traderCity = value;
    }

    /**
     * Ruft den Wert der traderNameMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderNameMatch() {
        return traderNameMatch;
    }

    /**
     * Legt den Wert der traderNameMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderNameMatch(String value) {
        this.traderNameMatch = value;
    }

    /**
     * Ruft den Wert der traderCompanyTypeMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyTypeMatch() {
        return traderCompanyTypeMatch;
    }

    /**
     * Legt den Wert der traderCompanyTypeMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyTypeMatch(String value) {
        this.traderCompanyTypeMatch = value;
    }

    /**
     * Ruft den Wert der traderStreetMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreetMatch() {
        return traderStreetMatch;
    }

    /**
     * Legt den Wert der traderStreetMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreetMatch(String value) {
        this.traderStreetMatch = value;
    }

    /**
     * Ruft den Wert der traderPostcodeMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcodeMatch() {
        return traderPostcodeMatch;
    }

    /**
     * Legt den Wert der traderPostcodeMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcodeMatch(String value) {
        this.traderPostcodeMatch = value;
    }

    /**
     * Ruft den Wert der traderCityMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCityMatch() {
        return traderCityMatch;
    }

    /**
     * Legt den Wert der traderCityMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCityMatch(String value) {
        this.traderCityMatch = value;
    }

    /**
     * Ruft den Wert der requestIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Legt den Wert der requestIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

}

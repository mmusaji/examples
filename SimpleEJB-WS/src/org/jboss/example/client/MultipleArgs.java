
package org.jboss.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multipleArgs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multipleArgs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="one" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="two" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="three" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multipleArgs", propOrder = {
    "one",
    "two",
    "three"
})
public class MultipleArgs {

    protected String one;
    protected String two;
    protected String three;

    /**
     * Gets the value of the one property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOne() {
        return one;
    }

    /**
     * Sets the value of the one property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOne(String value) {
        this.one = value;
    }

    /**
     * Gets the value of the two property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwo() {
        return two;
    }

    /**
     * Sets the value of the two property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwo(String value) {
        this.two = value;
    }

    /**
     * Gets the value of the three property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThree() {
        return three;
    }

    /**
     * Sets the value of the three property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThree(String value) {
        this.three = value;
    }

}

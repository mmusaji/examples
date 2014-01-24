
package org.jboss.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for someRestrictedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="someRestrictedObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="someNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "someRestrictedObject", propOrder = {
    "someNumber"
})
public class SomeRestrictedObject {

    protected int someNumber;

    /**
     * Gets the value of the someNumber property.
     * 
     */
    public int getSomeNumber() {
        return someNumber;
    }

    /**
     * Sets the value of the someNumber property.
     * 
     */
    public void setSomeNumber(int value) {
        this.someNumber = value;
    }

}

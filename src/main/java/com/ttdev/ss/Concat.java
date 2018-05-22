
package com.ttdev.ss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="s1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="s2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "s1",
    "s2"
})
@XmlRootElement(name = "concat")
public class Concat {

    @XmlElement(required = true)
    protected String s1;
    @XmlElement(required = true)
    protected String s2;

    /**
     * Obtiene el valor de la propiedad s1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1() {
        return s1;
    }

    /**
     * Define el valor de la propiedad s1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1(String value) {
        this.s1 = value;
    }

    /**
     * Obtiene el valor de la propiedad s2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS2() {
        return s2;
    }

    /**
     * Define el valor de la propiedad s2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS2(String value) {
        this.s2 = value;
    }

}

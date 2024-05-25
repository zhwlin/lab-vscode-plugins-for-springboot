
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。</p>
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Subtract")
public class Subtract {

    protected int intA;
    protected int intB;

    /**
     * 获取intA属性的值。
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * 设置intA属性的值。
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * 获取intB属性的值。
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * 设置intB属性的值。
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}

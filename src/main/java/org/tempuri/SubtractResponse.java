
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element name="SubtractResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "subtractResult"
})
@XmlRootElement(name = "SubtractResponse")
public class SubtractResponse {

    @XmlElement(name = "SubtractResult")
    protected int subtractResult;

    /**
     * 获取subtractResult属性的值。
     * 
     */
    public int getSubtractResult() {
        return subtractResult;
    }

    /**
     * 设置subtractResult属性的值。
     * 
     */
    public void setSubtractResult(int value) {
        this.subtractResult = value;
    }

}


package WSBarcode.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPagesResponse", namespace = "http://WSBarcode/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPagesResponse", namespace = "http://WSBarcode/")
public class GetPagesResponse {

    @XmlElement(name = "return", namespace = "")
    private Short _return;

    /**
     * 
     * @return
     *     returns Short
     */
    public Short getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Short _return) {
        this._return = _return;
    }

}

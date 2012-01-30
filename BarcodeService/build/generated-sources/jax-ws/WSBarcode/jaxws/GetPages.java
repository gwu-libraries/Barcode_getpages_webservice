
package WSBarcode.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPages", namespace = "http://WSBarcode/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPages", namespace = "http://WSBarcode/")
public class GetPages {

    @XmlElement(name = "barcode", namespace = "")
    private String barcode;

    /**
     * 
     * @return
     *     returns String
     */
    public String getBarcode() {
        return this.barcode;
    }

    /**
     * 
     * @param barcode
     *     the value for the barcode property
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

}

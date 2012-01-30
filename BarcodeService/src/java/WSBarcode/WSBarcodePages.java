/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSBarcode;

import Data.BookHelper;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "WSBarcodePages",wsdlLocation = "WEB-INF/wsdl/WSBarcodePages.wsdl")
public class WSBarcodePages {

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPages")
    public Short getPages(@WebParam(name = "barcode") String barcode) {
        //TODO write your implementation code here:
        BookHelper h = new BookHelper();
        return h.getNumberOfPages(barcode);
    }
}

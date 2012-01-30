/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class BookHelper {
    Session session = null;

    public BookHelper()
    {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public Short getNumberOfPages(String barcode)
    {
        Short pages=null;
        try
        {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("select book.numberOfPages from OrderBook book where book.customerBarcode = '" +barcode+"'");
        pages = (Short) q.uniqueResult();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return pages;

    }

}

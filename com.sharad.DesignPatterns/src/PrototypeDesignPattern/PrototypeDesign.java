


package PrototypeDesignPattern;

/**
 *
 * @author sharad
 */
public class PrototypeDesign {
    
    public static void main(String[] args) throws Exception{
    
        BookShop bs = new BookShop();
        bs.setShopName("Shop 1");
        bs.loadBooks();
        
        BookShop bs1 = (BookShop)bs.clone();  //shallow cloning --> deep cloning
        
        //bs.getBooks().remove(2);
        
        bs1.setShopName("Shop 2");
        System.out.println(bs);
        System.out.println(bs1);
        
    }
}

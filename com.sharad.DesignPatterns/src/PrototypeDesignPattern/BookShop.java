


package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sharad
 */
public class BookShop implements Cloneable{
    
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop {" + " shopName= " + shopName + ", books=" + books + '}';
    }
    
    public void loadBooks()
    {
        for(int i=0;i<10;i++)
        {
            Book b = new Book();
            b.setB_id(i);
            b.setB_name("Book "+i);
            getBooks().add(b);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
//    protected BookShop clone1() throws CloneNotSupportedException
//            
//    {
//            BookShop shop=new BookShop();
//            
//            for(Book b : this.getBooks())
//            {
//                shop.getBooks().add(b);
//            }
//            
//            return shop;
//    }
}

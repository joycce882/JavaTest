package java24_11_15.ArrnyList;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;  //书名
    private  String author; //作者

    private static List<Book> bookcollection = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookcollection.add(this);
    }
    public String gettitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void displayinfo(){
        System.out.println("书名："+gettitle());
        System.out.println("作者："+getAuthor());
    }
    public static void Allbookdisplay(){
        System.out.println("当前所有书籍：");
        for (Book book : bookcollection) {
            book.displayinfo();
            System.out.println("--------------");
        }
    }
}

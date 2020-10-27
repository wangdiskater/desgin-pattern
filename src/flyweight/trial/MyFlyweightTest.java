package flyweight.trial;

import memeto.trial.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 场景：图书馆借书，假设每本书都有无限本。每本书都可以被一个学号去借阅
 * @ClassName MyFlyweightTest
 * @Author wangDi
 * @date 2020-10-14 10:12
 */


public class MyFlyweightTest {

    static List<IBook> scutBooks = new ArrayList<>();
    static List<BookContext> studentQueue = new ArrayList<>();
    static BookFactory bookFactory = new BookFactory();


    public static void main(String[] args) {

        borrowBook("《书剑恩仇录》","202007130419");
        borrowBook("《小李飞刀1》", Integer.toString((int) Math.floor(Math.random() * 100000)));
        borrowBook("《小李飞刀2》", Integer.toString((int) Math.floor(Math.random() * 100000)));
        borrowBook("《小李飞刀3》", Integer.toString((int) Math.floor(Math.random() * 100000)));
        borrowBook("《小李飞刀4》", Integer.toString((int) Math.floor(Math.random() * 100000)));
        borrowBook("《书剑恩仇录》","202007130419");

        // iterator
        for (int i = 0; i < scutBooks.size(); i++) {
            scutBooks.get(i).serveBook(studentQueue.get(i));
        }

    }

    private static void borrowBook(String bookName, String studentNumber) {
        ScutBook book = bookFactory.getBook(bookName);
        scutBooks.add(book);
        BookContext bookContext = new BookContext(studentNumber);
        studentQueue.add(bookContext);
    }
}

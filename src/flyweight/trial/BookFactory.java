package flyweight.trial;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName BookFactory
 * @Author wangDi
 * @date 2020-10-14 10:22
 */
public class BookFactory {

    Map<String,ScutBook> library = new HashMap<>();


    ScutBook getBook(String bookName) {
        ScutBook scutBook = library.get(bookName);
        if (scutBook != null) {
            return scutBook;
        }
        ScutBook newBook = new ScutBook(bookName);
        library.put(bookName,newBook);

        return newBook;
    }


}

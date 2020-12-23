package firsttry.memeto.trial;

import java.util.HashMap;

/**
 * @Description 我正在读《那不勒斯四部曲》我在每一本书都设置一个锚点，随时准备回去看哪一本，而且这些是没有先后顺序关系的，随机存取的，所以可以想看哪本就看哪本
 * 需要一个子类去保存一些信息，数据库的版本管理也许就是用了这种思路
 *
 * @ClassName MyMemetoTest
 * @Author wangDi
 * @date 2020-10-12 16:37
 */
public class MyMemetoTest {

    public static void main(String[] args) {
        Reader reader = new Reader();

//        List<Reader.Book> booksTag = new ArrayList<>();
        /**
         * 用map可以随机存取，既然是回到一个时间点，应该这样会好一点。想回到哪个就回到哪个
         */
        HashMap<String, Reader.Book> booksTag = new HashMap<>();

        String book1 = "我的天才女友";
        booksTag.put(book1,new Reader.Book(book1));
        reader.setBookName(book1);

        String book2 = "新名字的故事";
        booksTag.put(book2, new Reader.Book(book2));
        reader.setBookName(book2);

        String book3 = "离开的,留下的";
        booksTag.put(book3, new Reader.Book(book3));
        reader.setBookName(book3);

        String book4 = "失踪的孩子";
        booksTag.put(book4, new Reader.Book(book4));
        reader.setBookName(book4);

        System.out.println("正在阅读的书籍：" + reader.getBookName());
        reader.backToAnotherBook(booksTag.get(book1));
        System.out.println("正在阅读的书籍：" + reader.getBookName());

    }
}

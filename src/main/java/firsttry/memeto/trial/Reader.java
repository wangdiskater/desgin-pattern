package firsttry.memeto.trial;

/**
 * @Description
 * @ClassName Reader
 * @Author wangDi
 * @date 2020-10-12 16:39
 */
public class Reader {

    private String bookName;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void backToAnotherBook(Book book) {
        bookName = book.getBookName();
    }

    /**
     * 保存状态 -- 类似一个标签
     */
    public static class Book {
        private final String bookName;

        public Book(String bookName) {
            this.bookName = bookName;
        }

        public String getBookName() {
            return bookName;
        }
    }

}

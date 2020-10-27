package flyweight.trial;

import java.time.LocalDate;

/**
 * @Description
 * @ClassName ScutBook
 * @Author wangDi
 * @date 2020-10-14 10:19
 */
public class ScutBook implements IBook {

    private String bookName;

    public ScutBook(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void serveBook(BookContext bookContext) {
        String studentNumber = bookContext.getStudentNumber();
        LocalDate now = LocalDate.now();
        String log = "华工学生编号：%s在%s,借了%s，希望你能认真阅读。 ----SCUT图书馆管理员";
        System.out.println(String.format(log,studentNumber,now,bookName));
    }
}

package flyweight.trial;

/**
 * @Description
 * @ClassName BookContext
 * @Author wangDi
 * @date 2020-10-14 10:18
 */
public class BookContext {

    private String studentNumber;

    public BookContext(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

}

package visitor.example;

/**
 * @Description
 * @ClassName Element
 * @Author wangDi
 * @date 2020-10-22 10:34
 */
public interface Element {
    void accept(Visitor vistor);
}

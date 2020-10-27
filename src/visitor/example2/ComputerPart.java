package visitor.example2;

/**
 * @Description
 * @ClassName ComputerPart
 * @Author wangdi
 * @date 2020-10-22 11:32
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

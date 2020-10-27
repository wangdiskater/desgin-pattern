package visitor.example2;

import visitor.example2.imp.computerpart.Computer;
import visitor.example2.imp.visitor.ComputerPartDisplayVistor;
import visitor.example2.imp.visitor.ProgramVisitor;

/**
 * @Description 我们将创建一个定义接受操作的 ComputerPart 接口。Keyboard、Mouse、Monitor 和 Computer 是实现了 ComputerPart 接口的实体类。
 * 我们将定义另一个接口 ComputerPartVisitor，它定义了访问者类的操作。Computer 使用实体访问者来执行相应的动作。
 * VisitorPatternDemo，我们的演示类使用 Computer、ComputerPartVisitor 类来演示访问者模式的用法。
 *
 * @ClassName VisitorTest
 * @Author wangDi
 * @date 2020-10-22 11:30
 */
public class VisitorTest {

    public static void main(String[] args) {
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVistor();
        ComputerPart computer = new Computer();
        computer.accept(computerPartVisitor);

        ProgramVisitor programVisitor = new ProgramVisitor();
        computer.accept(programVisitor);

    }

}

package firsttry.visitor.example2.imp.visitor;

import firsttry.visitor.example2.ComputerPartVisitor;
import firsttry.visitor.example2.imp.computerpart.*;

/**
 * @Description
 * @ClassName ComputerPartDisplayVistor
 * @Author wangDi
 * @date 2020-10-22 11:43
 */
public class ComputerPartDisplayVistor extends ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("display computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard");

    }

    @Override
    public void visit(Monitor Monitor) {
        System.out.println("display monitor");

    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("could i enter CPU?");
    }
}

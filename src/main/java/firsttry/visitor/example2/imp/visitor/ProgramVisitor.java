package firsttry.visitor.example2.imp.visitor;

import firsttry.visitor.example2.ComputerPartVisitor;
import firsttry.visitor.example2.imp.computerpart.*;

/**
 * @Description
 * @ClassName ProgramVisitor
 * @Author wangDi
 * @date 2020-10-22 12:01
 */
public class ProgramVisitor extends ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("i can admin computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("use mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("use keyboard");
    }

    @Override
    public void visit(Monitor Monitor) {
        System.out.println("use monitor");
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("of course i can handle cpu!");
    }
}

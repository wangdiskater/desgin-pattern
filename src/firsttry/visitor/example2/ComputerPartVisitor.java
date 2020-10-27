package firsttry.visitor.example2;

import firsttry.visitor.example2.imp.computerpart.*;
/**
 * @Description
 * @ClassName ComputerPartVisitor
 * @Author wangDi
 * @date 2020-10-22 11:38
 */
public abstract class ComputerPartVisitor {
    public abstract void visit(Computer computer);
    public abstract void visit(Mouse mouse);
    public abstract void visit(Keyboard keyboard);
    public abstract void visit(Monitor Monitor);
    public abstract void visit(CPU cpu);

}

package visitor.example2.imp.computerpart;

import visitor.example2.ComputerPart;
import visitor.example2.ComputerPartVisitor;

/**
 * @Description
 * @ClassName Keyboard
 * @Author wangDi
 * @date 2020-10-22 11:36
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

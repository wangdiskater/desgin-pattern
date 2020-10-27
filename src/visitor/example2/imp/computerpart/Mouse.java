package visitor.example2.imp.computerpart;

import visitor.example2.ComputerPart;
import visitor.example2.ComputerPartVisitor;

/**
 * @Description
 * @ClassName Mouse
 * @Author wangDi
 * @date 2020-10-22 11:38
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);

    }
}

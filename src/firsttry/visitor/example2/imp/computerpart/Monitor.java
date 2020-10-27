package firsttry.visitor.example2.imp.computerpart;

import firsttry.visitor.example2.ComputerPart;
import firsttry.visitor.example2.ComputerPartVisitor;

/**
 * @Description
 * @ClassName Monitor
 * @Author wangDi
 * @date 2020-10-22 11:42
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);

    }
}

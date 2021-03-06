package firsttry.visitor.example2.imp.computerpart;

import firsttry.visitor.example2.ComputerPart;
import firsttry.visitor.example2.ComputerPartVisitor;

/**
 * @Description
 * @ClassName CPU
 * @Author wangDi
 * @date 2020-10-22 11:49
 */
public class CPU implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

package visitor.example2.imp.computerpart;

import visitor.example2.ComputerPart;
import visitor.example2.ComputerPartVisitor;
import visitor.example2.imp.visitor.ComputerPartDisplayVistor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @ClassName Computer
 * @Author wangDi
 * @date 2020-10-22 11:33
 */
public class Computer implements ComputerPart {

    private List<ComputerPart> parts;

    public Computer() {
        parts = new ArrayList<>();
        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());
        parts.add(new CPU());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);

        if (computerPartVisitor instanceof ComputerPartDisplayVistor) {
            List<ComputerPart> collect = parts.stream().filter(computerPart -> !(computerPart instanceof CPU)).collect(Collectors.toList());
            collect.forEach(computerPart -> computerPart.accept(computerPartVisitor));

        } else {

            parts.forEach(computerPart -> computerPart.accept(computerPartVisitor));
        }

    }
}

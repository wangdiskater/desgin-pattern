package visitor.example.imp;

import visitor.example.Element;
import visitor.example.Visitor;

/**
 * @Description
 * @ClassName Park
 * @Author wangDi
 * @date 2020-10-22 10:36
 */
public class Park implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting visitor.");
        visitor.visit(this);
    }
}

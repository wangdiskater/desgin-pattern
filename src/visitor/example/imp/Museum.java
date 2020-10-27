package visitor.example.imp;

import visitor.example.Element;
import visitor.example.Visitor;

/**
 * @Description
 * @ClassName Museum
 * @Author wangDi
 * @date 2020-10-22 10:37
 */
public class Museum implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visitor.");
        visitor.visit(this);
    }
}

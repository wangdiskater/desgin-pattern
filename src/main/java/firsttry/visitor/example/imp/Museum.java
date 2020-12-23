package firsttry.visitor.example.imp;

import firsttry.visitor.example.Element;
import firsttry.visitor.example.Visitor;

/**
 * @Description
 * @ClassName Museum
 * @Author wangDi
 * @date 2020-10-22 10:37
 */
public class Museum implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting firsttry.visitor.");
        visitor.visit(this);
    }
}

package firsttry.visitor.example.imp;

import firsttry.visitor.example.Element;
import firsttry.visitor.example.Visitor;

/**
 * @Description
 * @ClassName Park
 * @Author wangDi
 * @date 2020-10-22 10:36
 */
public class Park implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting firsttry.visitor.");
        visitor.visit(this);
    }
}

package firsttry.visitor.example.imp;

import firsttry.visitor.example.Visitor;

/**
 * @Description
 * @ClassName FirstTimeVisitor
 * @Author wangDi
 * @date 2020-10-22 10:38
 */
public class FirstTimeVisitor extends Visitor {
    @Override
    public void visit(City city) {
        System.out.println("I'm visiting the city!");

    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the Museum!");

    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the Park!");

    }
}

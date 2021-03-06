package firsttry.visitor.example;

import firsttry.visitor.example.imp.City;
import firsttry.visitor.example.imp.Museum;
import firsttry.visitor.example.imp.Park;

/**
 * @Description
 * @ClassName Visitor
 * @Author wangDi
 * @date 2020-10-22 10:34
 */
public abstract class Visitor {
    public abstract void visit(City city);

    public abstract void visit(Museum museum);

    public abstract void visit(Park park);

}

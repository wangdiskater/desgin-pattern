package firsttry.visitor.example.imp;

import firsttry.visitor.example.Element;
import firsttry.visitor.example.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName City
 * @Author wangDi
 * @date 2020-10-22 10:35
 */
public class City implements Element {
    List<Element> places = new ArrayList<Element>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting firsttry.visitor.");
        visitor.visit(this);

        for (Element e : places) {
            e.accept(visitor);
        }
    }
}

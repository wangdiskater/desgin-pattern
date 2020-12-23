package headfirst.component.example;

import java.util.Iterator;

/**
 * @Description
 * @ClassName TestCompositeIterator
 * @Author wangDi
 * @date 2020-11-23 11:16
 */
public class TestCompositeIterator {

    public void testCompositeIterator(DefaultMenuComponent component) {
        CompositeIterator compositeIterator = new CompositeIterator(component.createIterator());

        while (compositeIterator.hasNext()) {
            compositeIterator.next();
        }



    }


}

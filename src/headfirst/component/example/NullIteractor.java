package headfirst.component.example;

import java.util.Iterator;

/**
 * @Description
 * @ClassName NullIteractor
 * @Author wangDi
 * @date 2020-11-23 11:06
 */

public class NullIteractor implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

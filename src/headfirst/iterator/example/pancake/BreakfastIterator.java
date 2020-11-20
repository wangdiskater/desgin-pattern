package headfirst.iterator.example.pancake;

import headfirst.iterator.example.Iterator;
import headfirst.iterator.example.MenuItem;

import java.util.List;

/**
 * @Description
 * @ClassName Breakfast
 * @Author wangDi
 * @date 2020-11-19 11:30
 */
public class BreakfastIterator implements Iterator {
    List<MenuItem> items;
    int index = 0;

    public BreakfastIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.size() || items.get(index) == null) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(index);
        index++;

        return menuItem;
    }
}

package headfirst.iterator.example.diner;

import headfirst.iterator.example.Iterator;
import headfirst.iterator.example.MenuItem;

/**
 * @Description
 * @ClassName DinerMenuIterator
 * @Author wangDi
 * @date 2020-11-19 11:26
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int index = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.length || items[index] == null) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[index];
        index++;
        return item;
    }
}

package headfirst.iterator.example.pancake;

import headfirst.iterator.example.Iterator;
import headfirst.iterator.example.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName PancakeMenu
 * @Author wangDi
 * @date 2020-11-19 11:47
 */
public class PancakeMenu {
    private List<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems  = new ArrayList<>();
    }

    public Iterator createIterator() {
        return new BreakfastIterator(menuItems);
    }

}

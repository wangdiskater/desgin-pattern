package headfirst.iterator.example.pancake;

import headfirst.iterator.example.Iterator;
import headfirst.iterator.example.Menu;
import headfirst.iterator.example.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName PancakeMenu
 * @Author wangDi
 * @date 2020-11-19 11:47
 */
public class PancakeMenu  implements Menu {
    private List<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems  = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }
}

package headfirst.iterator.example.diner;

import headfirst.iterator.example.Iterator;
import headfirst.iterator.example.Menu;
import headfirst.iterator.example.MenuItem;

/**
 * @Description
 * @ClassName DinerMenu
 * @Author wangDi
 * @date 2020-11-19 11:35
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full !Can’t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
}

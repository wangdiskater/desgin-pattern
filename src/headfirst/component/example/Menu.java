package headfirst.component.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @ClassName Menu
 * @Author wangDi
 * @date 2020-11-23 10:01
 */
public class Menu extends DefaultMenuComponent {
    List<DefaultMenuComponent> menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(DefaultMenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(DefaultMenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public DefaultMenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("  name: " + getName());
        System.out.print("  description: " + getDescription());
        System.out.println();

        // 迭代打印子节点
        Iterator<DefaultMenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuComponents=" + menuComponents +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

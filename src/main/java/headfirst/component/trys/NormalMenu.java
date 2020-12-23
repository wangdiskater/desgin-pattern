package headfirst.component.trys;

import headfirst.component.example.DefaultMenuComponent;
import headfirst.component.example.Menu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @ClassName AbstractMenu
 * @Author wangDi
 * @date 2020-12-23 10:37
 */
public class NormalMenu extends DefaultComponent {
    List<DefaultComponent> subList;
    private String name;
    private String description;

    public NormalMenu(String name, String description) {
        this.name = name;
        this.description = description;
        subList = new ArrayList<>();
    }

    @Override
    public void add(DefaultComponent menuComponent) { subList.add(menuComponent); }

    @Override
    public void remove(DefaultComponent menuComponent) { subList.remove(menuComponent); }

    @Override
    public DefaultComponent getChild(int i) { return subList.get(i); }
    /**
     * 遍历打印
     */
    @Override
    public void print() {
        System.out.println(name + "  -  " + description);
        //   这里其实有迭代器
        subList.forEach(DefaultComponent::print);
    }

    @Override
    public String getName() { return name;}

    @Override
    public String getDescription() { return description; }

    @Override
    public double getPrice() { return super.getPrice(); }

    @Override
    public boolean isVegetarian() { return super.isVegetarian(); }

    @Override
    public Iterator createIterator() { return super.createIterator(); }

    @Override
    public String toString() {
        return "NormalMenu{" +
                "subList=" + subList +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

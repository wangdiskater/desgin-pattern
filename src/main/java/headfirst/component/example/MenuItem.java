package headfirst.component.example;

import java.util.Iterator;

/**
 * @Description
 * @ClassName MenuItem
 * @Author wangDi
 * @date 2020-11-23 09:30
 */
public class MenuItem extends DefaultMenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(DefaultMenuComponent menuComponent) {
        super.add(menuComponent);
    }

    @Override
    public void remove(DefaultMenuComponent menuComponent) {
        super.remove(menuComponent);
    }

    /**
     * 叶子节点没有子节点，所以不需要实现这个方法
     */
/*    @Override
    public DefaultMenuComponent getChild(int i) {
        return super.getChild(i);
    }*/
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public void print() {
        System.out.print("  name: " + getName());
        if (isVegetarian()) {
            System.out.print("  (v)");
        }
        System.out.print("  price: " + getPrice());
        System.out.print("  description: " + getDescription());
        System.out.println();
    }

    /**
     * 返回类比直接返回null要好
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new NullIteractor();
    }
}

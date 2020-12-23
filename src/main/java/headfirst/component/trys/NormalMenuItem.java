package headfirst.component.trys;

import java.util.Iterator;

/**
 * @Description
 * @ClassName NormalMenuItem
 * @Author wangDi
 * @date 2020-12-23 10:50
 */
public class NormalMenuItem extends DefaultComponent{
    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;

    public NormalMenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
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
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    // 暂时不实现
    @Override
    public Iterator createIterator() {
        return super.createIterator();
    }

    // 默认就是抛异常
    @Override
    public void add(DefaultComponent menuComponent) { super.add(menuComponent); }

    @Override
    public void remove(DefaultComponent menuComponent) { super.remove(menuComponent); }

    @Override
    public DefaultComponent getChild(int i) { return super.getChild(i); }

    @Override
    public String toString() {
        return "NormalMenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}

package headfirst.component.example;


import java.util.Iterator;

/**
 * @Description
 * @ClassName MenuComponent
 * @Author wangDi
 * @date 2020-11-20 20:22
 */
public abstract class DefaultMenuComponent {
    public void add(DefaultMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(DefaultMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public DefaultMenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}

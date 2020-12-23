package headfirst.component.trys;


import java.util.Iterator;

/**
 * @Description
 * @ClassName MenuComponent
 * @Author wangDi
 * @date 2020-11-20 20:22
 */
public abstract class DefaultComponent {
    public void add(DefaultComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(DefaultComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public DefaultComponent getChild(int i) {
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

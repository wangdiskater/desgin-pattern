package headfirst.component.example;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Description
 * @ClassName CompositeIterator
 * @Author wangDi
 * @date 2020-11-23 11:05
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator<DefaultMenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator peek = stack.peek();
            DefaultMenuComponent component = (DefaultMenuComponent) peek.next();
            if (component instanceof  Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}

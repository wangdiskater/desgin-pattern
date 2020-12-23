package headfirst.adapter.example;

import javax.swing.text.html.HTMLDocument;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Description
 * @ClassName EnumerationIterator
 * @Author wangDi
 * @date 2020-11-16 15:02
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}

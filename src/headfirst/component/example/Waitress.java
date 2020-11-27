package headfirst.component.example;

import java.util.Iterator;

/**
 * @Description
 * @ClassName ComponentTest
 * @Author wangDi
 * @date 2020-11-23 10:07
 */
public class Waitress {

    DefaultMenuComponent allMenus;

    public Waitress(DefaultMenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void print() {
        allMenus.print();
    }




    public void printVegetarianMenu(){

        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {

            DefaultMenuComponent defaultMenuComponent = (DefaultMenuComponent) iterator.next();

            try {
                if (defaultMenuComponent.isVegetarian()) {
                    defaultMenuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                System.out.println(defaultMenuComponent);
            }
        }
    }
}

package headfirst.iterator.example;

import headfirst.iterator.example.diner.DinerMenu;
import headfirst.iterator.example.pancake.BreakfastIterator;
import headfirst.iterator.example.pancake.PancakeMenu;

/**
 * @Description
 * @ClassName Waiter
 * @Author wangDi
 * @date 2020-11-19 12:01
 */
public class Waiter {
    PancakeMenu pancakeMenu;
    DinerMenu dinerMenu;

    public Waiter(PancakeMenu pancakeMenu, DinerMenu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator iterator = dinerMenu.createIterator();

        printMenu(pancakeIterator);
    }

    // reload
    private void printMenu(Iterator pancakeIterator) {
        while (pancakeIterator.hasNext()) {
            System.out.println(pancakeIterator.next());
        }
    }

}

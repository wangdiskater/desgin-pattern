package headfirst.iterator.example;

import headfirst.iterator.example.diner.DinerMenu;

/**
 * @Description
 * @ClassName IteratorTest
 * @Author wangDi
 * @date 2020-11-19 11:37
 */
public class IteratorTest {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("酥炸小黄瓜","新菜谱",Boolean.TRUE,10);

        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

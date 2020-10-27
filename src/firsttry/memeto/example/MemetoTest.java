package firsttry.memeto.example;

import java.util.ArrayList;
import java.util.List;

/**
 * In the following example, You can time travel to any era for your Life, and You can restore to a previous era you have been to.
 * @Description
 * @ClassName MemetoTest
 * @Author wangDi
 * @date 2020-10-12 16:26
 */
public class MemetoTest {

    public static void main(String[] args) {

        List<Life.Memento> mementos = new ArrayList<>();

        Life life = new Life();

        life.set("公元2020年10月12日");
        mementos.add(life.saveToMemento());

        life.set("公元前2020年10月12日");
        mementos.add(life.saveToMemento());

        life.set("公元前500年");
        mementos.add(life.saveToMemento());

        System.out.println("当前时间是：" +life.getTime());
        life.restoreFromMemento(mementos.get(0));
        System.out.println("当前时间是：" +life.getTime());


    }
}

package State.trial;

/**
 * @Description 我的状态场景：奥特曼的状态： 正常人状态（谁都打不过），蓝灯状态（打架贼菜），红灯状态（可以一打十）
 * @ClassName MyStateTest
 * @Author wangDi
 * @date 2020-10-21 17:04
 */
public class MyStateTest {
    public static void main(String[] args) {
        WarContext warContext = new WarContext();
        warContext.init();
        warContext.fight();
        warContext.fight();
        warContext.fight();
        warContext.fight();
        warContext.fight();

    }
}

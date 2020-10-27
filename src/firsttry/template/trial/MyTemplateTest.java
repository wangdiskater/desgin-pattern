package firsttry.template.trial;

/**
 * @Description  比如说我们打游戏，游戏的角色都有模板，比如走路，跳跃，拣去东西，打怪
 * @ClassName MyTemplateTest
 * @Author wangDi
 * @date 2020-10-16 14:06
 */
public class MyTemplateTest {


    public static void main(String[] args) {
        Player player = new Magician();

        player.setHasHp(Boolean.TRUE);
        player.setHasMp(Boolean.TRUE);

        player.start();
    }

}

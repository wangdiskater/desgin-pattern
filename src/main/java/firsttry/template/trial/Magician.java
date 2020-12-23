package firsttry.template.trial;

/**
 * @Description
 * @ClassName Magician
 * @Author wangDi
 * @date 2020-10-16 14:27
 */
public class Magician extends Player {
    @Override
    void walk() {
        System.out.println("走路=瞬移");
    }

    @Override
    void jump() {
        System.out.println("跳跃=瞬移");

    }

    @Override
    void pick() {
        System.out.println("拣");

    }

    @Override
    void attack() {
        System.out.println("魔法双击");

    }
}

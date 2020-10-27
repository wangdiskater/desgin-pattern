package decorator.example;

/**
 * @Description
 * @ClassName Science
 * @Author wangDi
 * @date 2020-10-15 16:13
 */
public class Science extends GirlDecorator{
    private Girl girl;

    public Science(Girl girl) {
        this.girl = girl;
    }

    /**
     * 只有继承了才能改写girl的方法，其实也是可以用AOP控制
     * @return
     */
    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void caltulateStuff() {
        System.out.println("scientific calculation!");
    }
}

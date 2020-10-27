package decorator.example;

/**
 * @Description
 * @ClassName Art
 * @Author wangDi
 * @date 2020-10-15 16:14
 */
public class Art extends Girl{
    private Girl girl;

    public Art(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("draw pictures!");
    }
}

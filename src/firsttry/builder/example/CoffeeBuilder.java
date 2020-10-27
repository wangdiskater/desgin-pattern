package firsttry.builder.example;

/**
 * @Description
 * @ClassName CoffeeBuilder
 * @Author wangDi
 * @date 2020-10-12 17:11
 */
public class CoffeeBuilder extends StarbucksBuilder {
    public CoffeeBuilder() {
    }

    @Override
    public void buildSize() {
        starBucks.setSize("medium");
        System.out.println("build medium size");
    }

    @Override
    public void buildDrink() {
        starBucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}

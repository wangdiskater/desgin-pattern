package builder.example;

/**
 * @Description
 * @ClassName TeaBuilder
 * @Author wangDi
 * @date 2020-10-12 17:12
 */
public class TeaBuilder extends StarbucksBuilder {
    public TeaBuilder() {
    }

    @Override
    public void buildSize() {
        starBucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starBucks.setDrink("tea");
        System.out.println("build tea");
    }
}

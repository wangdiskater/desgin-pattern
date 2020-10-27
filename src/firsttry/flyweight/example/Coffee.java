package firsttry.flyweight.example;

/**
 * @Description
 * @ClassName Coffee
 * @Author wangDi
 * @date 2020-10-10 15:12
 */
public class Coffee implements ICoffee {
    private final String flavor;
    public String getFlavor() {
        return flavor;
    }
    public Coffee(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serveCoffee(CoffeeContext coffeeContext) {
        String str = "第%s桌需要咖啡,咖啡风味：%s";
        System.out.println(String.format(str, coffeeContext.getTableNumber(), flavor));

    }
}

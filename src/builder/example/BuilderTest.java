package builder.example;

/**
 * @Description In the following example, we can define a drink builder called StarbucksBuilder which will build a Starbucks drink.
 * StarbucksBuilder has several steps to build a Starbucks drink, such as buildSize() and buildDrink(). And finally return the drink built.
 * @ClassName BuilderTest
 * @Author wangDi
 * @date 2020-10-12 17:06
 */
public class BuilderTest {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
        waiter.setStarbucksBuilder(coffeeBuilder);

        waiter.constructStarBucks();

        System.out.println();
    }
}

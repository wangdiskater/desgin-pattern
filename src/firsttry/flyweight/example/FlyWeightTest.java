package firsttry.flyweight.example;

/**
 * @Description Flyweight pattern is used for minimizing memory usage. What it does is sharing as much data as possible with other similar objects.
 * 享元模式：以一个咖啡厅为例子，所有人都想喝咖啡，咖啡都放在工厂里
 *
 * @ClassName FlyWeightTest
 * @Author wangDi
 * @date 2020-10-10 15:03
 */
public class FlyWeightTest {

    //coffee array
    private static Coffee[] coffees = new Coffee[20];
    //table array
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;


    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++; // 通过ordersCount关联咖啡和上下文
    }


    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("卡布奇诺",1);
        takeOrder("卡布奇诺",1);
        takeOrder("摩卡",3);
        takeOrder("Whisky",1);
        takeOrder("Whisky",4);
        takeOrder("Whisky",2);

        for (int i = 0; i < ordersCount; i++) {
            coffees[i].serveCoffee(tables[i]);
        }
    }
}

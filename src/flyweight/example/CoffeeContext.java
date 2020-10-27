package flyweight.example;

/**
 * @Description
 * @ClassName CoffeeContext
 * @Author wangDi
 * @date 2020-10-10 15:11
 */
public class CoffeeContext {

    private final int tableNumber;
    public CoffeeContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }


}

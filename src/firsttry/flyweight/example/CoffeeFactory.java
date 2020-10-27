package firsttry.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName CoffeeFactory
 * @Author wangDi
 * @date 2020-10-10 15:14
 */
public class CoffeeFactory {

    /**
     * 享元的数据
     */
    private Map<String, Coffee> flavorMap = new HashMap<>();

    public  Coffee  getCoffeeFlavor(String flavorName) {
        Coffee coffee = flavorMap.get(flavorName);
        if (coffee != null) {
            return coffee;
        }
        Coffee newCoffee = new Coffee(flavorName);
        flavorMap.put(flavorName, newCoffee);
        return newCoffee;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavorMap.size();
    }
}

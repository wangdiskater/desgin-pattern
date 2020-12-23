package firsttry.visitor.example;

import firsttry.visitor.example.imp.City;
import firsttry.visitor.example.imp.FirstTimeVisitor;

/**
 * @Description Suppose a first time firsttry.visitor comes to New York City.
 * He want to visit the city and the city accepts his visit. Once the firsttry.visitor starts visit,
 * it automatically visit everything, and he doesn't need to call a method when he wants to go to a museum. The travel is a package!
 *
 * @ClassName VisitorTest
 * @Author wangDi
 * @date 2020-10-22 10:30
 */


public class VisitorTest {
    public static void main(String[] args) {
        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(firstTimeVisitor);
    }
}

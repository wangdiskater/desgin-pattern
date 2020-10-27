package template.example;

/**
 * @Description The Template Method design pattern defines the workflow for achieving a specific operation. It allows the subclasses to modify certain steps without changing the workflow's structure.
 * @ClassName TemplateTest
 * @Author wangDi
 * @date 2020-10-15 11:50
 */
public class TemplateTest {
    public static void main(String[] args) {
        testVehicle(new Car());
        testVehicle(new Truck());


    }

    static void testVehicle(Vehicle vehicle) {
        vehicle.testYourVehicle();
    }
}


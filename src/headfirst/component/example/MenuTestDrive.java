package headfirst.component.example;

/**
 * @Description
 * @ClassName MenuTestDrive
 * @Author wangDi
 * @date 2020-11-23 10:17
 */
public class MenuTestDrive {
    public static void main(String[] args) {

        DefaultMenuComponent pancakeHouse = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        DefaultMenuComponent dinerMenu = new Menu("DINER MENU", "lunch");
        DefaultMenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        DefaultMenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        DefaultMenuComponent allMenus = new Menu("ALL MENUS", "all menus combine ");
        allMenus.add(pancakeHouse);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta","spaghetti with marinara sauce",true,3.89));
        dinerMenu.add(dessertMenu);
        dinerMenu.add(new MenuItem("Apple pie","apple pie with a flakey crust, topped with vanilla ice cream",true,1.59));

        Waitress waitress = new Waitress(allMenus);

//        waitress.print();

        /**
         * 打印所有绿色
         */
        waitress.printVegetarianMenu();

    }
}

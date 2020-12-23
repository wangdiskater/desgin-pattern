package headfirst.template.example;

/**
 * @Description
 * @ClassName CaffeineBeverage
 * @Author wangDi
 * @date 2020-11-18 15:52
 */
public abstract class CaffeineBeverage {

    // 这个方法不希望子类继承
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("都要倒进杯子里");
    }

    private void boilWater() {
        System.out.println("都要烧水");
    }



    // 感觉有点像工厂方法，通过继承来创建对象
    protected abstract void brew();

    public abstract void addCondiments();
}

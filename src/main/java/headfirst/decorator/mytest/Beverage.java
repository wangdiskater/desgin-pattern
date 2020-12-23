package headfirst.decorator.mytest;

/**
 * @Description
 * @ClassName Beverage
 * @Author wangdi
 * @date 2020-10-30 10:46
 */
public abstract class Beverage {
    private String description;
    public String getDescription() {
        return description;
    }

    public abstract float cost();


    /**
     * 我们在星巴兹的朋友决定开始在菜单上加上咖啡的容量大小，供顾客可以选择小杯（tall）、中杯（grande）、大杯（venti）。
     * 星巴兹认为这是任何咖啡都必须具备的，所以在Beverage类中加上了getSize()与setSize()。他们也希望调料根据咖啡容量收费，例如：小中大杯的咖啡加上豆浆，分别加收0.10、0.15、0.20美金。
     * 如何改变装饰者类应对这样的需求？there are noDumb Questions
     *
     * 思考：
     * 大杯中杯小杯，我觉得应该也可以写成一个包装类，这样不更好吗？
     *
     */
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

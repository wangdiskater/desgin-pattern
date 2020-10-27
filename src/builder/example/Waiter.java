package builder.example;

/**
 * @Description
 * @ClassName Waiter
 * @Author wangDi
 * @date 2020-10-12 17:15
 */
public class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public StarbucksBuilder getStarbucksBuilder() {
        return starbucksBuilder;
    }

    public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    public void constructStarBucks(){
        // create （共性）
        starbucksBuilder.createStarBucks();

        // build （个性）
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }

}

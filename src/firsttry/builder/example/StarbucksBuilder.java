package firsttry.builder.example;

/**
 * @Description
 * @ClassName StarbucksBuilder
 * @Author wangDi
 * @date 2020-10-12 17:07
 */
public abstract class StarbucksBuilder {

    protected StarBucks starBucks;

    public StarbucksBuilder() {
    }

    public StarBucks getStarBucks(){
        return starBucks;
    }

    void createStarBucks(){
        starBucks = new StarBucks();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();

}

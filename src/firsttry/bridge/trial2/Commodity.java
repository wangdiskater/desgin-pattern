package firsttry.bridge.trial2;

/**
 * @Description
 * @ClassName Commodity
 * @Author wangDi
 * @date 2020-10-22 10:03
 */
public abstract class Commodity {

    private Color color;

    private String name;

    public Commodity(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}

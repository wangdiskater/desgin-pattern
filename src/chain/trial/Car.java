package chain.trial;

/**
 * @Description
 * @ClassName Car
 * @Author wangDi
 * @date 2020-10-10 17:04
 */
public class Car {

    private String name;

    private String outlook;

    private String window;

    private String wheel;

    private String motor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutlook() {
        return outlook;
    }

    public void setOutlook(String outlook) {
        this.outlook = outlook;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", outlook='" + outlook + '\'' +
                ", window='" + window + '\'' +
                ", wheel='" + wheel + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}

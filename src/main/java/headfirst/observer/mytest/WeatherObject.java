package headfirst.observer.mytest;

/**
 * @Description
 * @ClassName WeatherInfo
 * @Author wangDi
 * @date 2020-10-27 16:57
 */
public class WeatherObject {

    private String humidity;

    private String temperature;

    private String pressure;

    public WeatherObject(String humidity, String temperature, String pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherObject{" +
                "湿度：'" + humidity + '\'' +
                ", 温度：'" + temperature + '\'' +
                ", 压强：'" + pressure + '\'' +
                '}';
    }
}

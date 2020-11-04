package headfirst.observer.mytest;

import headfirst.observer.mytest.imp.NowBoard;
import headfirst.observer.mytest.imp.PreBoard;
import headfirst.observer.mytest.imp.StatisticBoard;
import headfirst.observer.mytest.imp.WeatherData;

/**
 * @Description 恭喜贵公司获选为敝公司建立下一代Internet气象观测站！该气象站必须建立在我们专利申请中的WeatherData对象上，
 * 由WeatherData对象负责追踪目前的天气状况（温度、湿度、气压）。我们希望贵公司能建立一个应用，有三种布告板，分别显示目前的状况、气象统计及简单的预报。
 * 当WeatherObject对象获得最新的测量数据时，三种布告板必须实时更新。而且，这是一个可以扩展的气象站，Weather-O-Rama气象站希望公布一组API，好让其他开发人员可以写出自己的气象布告板，
 * 并插入此应用中。我们希望贵公司能提供这样的API。
 * @ClassName MyObserverTest
 * @Author wangDi
 * @date 2020-10-27 17:08
 */
public class MyObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new NowBoard(weatherData));
        weatherData.registerObserver(new StatisticBoard());
        weatherData.registerObserver(new PreBoard());

        weatherData.setWeatherObject(new WeatherObject("60%","30摄氏度","101Kpa"));
        weatherData.setWeatherObject(new WeatherObject("50%","15摄氏度","99Kpa"));
        weatherData.setWeatherObject(new WeatherObject("1%","-100摄氏度","10Kpa"));

    }
}

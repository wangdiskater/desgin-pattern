package headfirst.observer.mytest.imp;

import headfirst.observer.mytest.MyObserver;
import headfirst.observer.mytest.Subject;
import headfirst.observer.mytest.WeatherObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName WeatherData
 * @Author wangDi
 * @date 2020-10-27 17:02
 */
public class WeatherData extends Subject {
    List<MyObserver> keyboards;
    WeatherObject weatherObject;

    public WeatherObject getWeatherObject() {
        return weatherObject;
    }

    public void setWeatherObject(WeatherObject weatherObject) {
        this.weatherObject = weatherObject;
        notifyObservers();
    }

    public WeatherData() {
        keyboards = new ArrayList<>();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        keyboards.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        keyboards.remove(observer);
    }



    @Override
    public void notifyObservers() {
        keyboards.forEach(myObserver -> myObserver.update(weatherObject));
        System.out.println("----------");
    }




}

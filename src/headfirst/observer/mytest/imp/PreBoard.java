package headfirst.observer.mytest.imp;

import headfirst.observer.mytest.MyObserver;
import headfirst.observer.mytest.WeatherObject;

import java.util.UUID;

/**
 * @Description
 * @ClassName PreBoard
 * @Author wangDi
 * @date 2020-10-27 17:01
 */
public class PreBoard extends MyObserver {
    @Override
    public void update(WeatherObject weatherObject) {
        System.out.println("天气预报：");
        String s = UUID.randomUUID().toString();

        System.out.println(new WeatherObject(s.substring(0, 10), s.substring(10, 20), s.substring(20, 30)));


    }
}

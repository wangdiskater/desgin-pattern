package headfirst.observer.mytest.imp;

import headfirst.observer.mytest.MyObserver;
import headfirst.observer.mytest.WeatherObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName StatisticBoard
 * @Author wangDi
 * @date 2020-10-27 17:01
 */
public class StatisticBoard extends MyObserver {
    List<WeatherObject> statisticList;

    public StatisticBoard() {
        statisticList = new ArrayList<>();
    }

    @Override
    public void update(WeatherObject weatherObject) {
        statisticList.add(weatherObject);
        System.out.println("统计,所有的记录如下：");

        statisticList.forEach(weatherObject1 -> {
            System.out.println(weatherObject1);
        });

    }
}

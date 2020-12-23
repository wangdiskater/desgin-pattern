package headfirst.observer.mytest.imp;

import headfirst.observer.mytest.MyObserver;
import headfirst.observer.mytest.Subject;
import headfirst.observer.mytest.WeatherObject;

/**
 * @Description 公告牌 - 现在信息
 * @ClassName KeyBoard
 * @Author wangDi
 * @date 2020-10-27 16:55
 */
public class NowBoard extends MyObserver {

    /**
     * 为什么要穿subject进来？
     * 是为了自己以后解绑更方便！！
     *
     */
    private Subject weatherData;

    public NowBoard(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(WeatherObject weatherObject) {
        System.out.println("现在信息：");
        System.out.println(weatherObject);
    }
}

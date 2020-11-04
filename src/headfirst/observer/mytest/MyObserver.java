package headfirst.observer.mytest;

/**
 * @Description
 * @ClassName MyObserver
 * @Author wangDi
 * @date 2020-10-27 16:50
 */
public abstract class MyObserver {

    /**
     * 每个公告牌实现自己的公告
     */
    public abstract void update(WeatherObject weatherObject);

}

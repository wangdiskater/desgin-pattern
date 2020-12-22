package headfirst.compound;

import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description
 * @ClassName DuckCall
 * @Author wangDi
 * @date 2020-12-10 14:38
 */
public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("kwak");
        // 自己叫了之后通知观察者
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}

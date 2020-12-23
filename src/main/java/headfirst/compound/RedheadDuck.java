package headfirst.compound;

import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description
 * @ClassName RedheadDuck
 * @Author wangDi
 * @date 2020-12-10 14:36
 */
public class RedheadDuck implements Quackable {
    // 有点像桥接模式
    Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("quack");
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

package headfirst.compound;

import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description
 * @ClassName MallardDuck
 * @Author wangDi
 * @date 2020-12-10 14:35
 */
public class MallardDuck implements Quackable {

    // 有点像桥接模式
    Observable observable;

    public MallardDuck() {
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

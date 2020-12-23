package headfirst.compound;

import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description
 * @ClassName RubberDuck
 * @Author wangDi
 * @date 2020-12-10 14:38
 */
public class RubberDuck implements Quackable {

    // 有点像桥接模式
    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("squeak");
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

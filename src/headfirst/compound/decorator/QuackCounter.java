package headfirst.compound.decorator;

import headfirst.compound.Quackable;
import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description 通过装饰者模式记录鸭子叫的次数.
 * @ClassName QuackCounter
 * @Author wangDi
 * @date 2020-12-10 14:46
 */
public class QuackCounter implements Quackable {
    Quackable quackable;
    // 有点像桥接模式
    Observable observable;

    // 所有的鸭子共用一个静态变量
    public static int count = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        count++;
        quackable.quack();
        observable.notifyObserver();
    }

    public int getCount() {
        return count;
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

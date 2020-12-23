package headfirst.compound.adapter;

import headfirst.compound.Goose;
import headfirst.compound.Quackable;
import headfirst.compound.observer.Observable;
import headfirst.compound.observer.Observer;

/**
 * @Description
 * @ClassName GooseAdapter
 * @Author wangDi
 * @date 2020-12-10 14:43
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    // 有点像桥接模式
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        observable.notifyObserver();

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

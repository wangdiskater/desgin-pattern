package headfirst.compound.observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @ClassName Observable
 * @Author wangDi
 * @date 2020-12-10 15:46
 */
public class Observable implements QuackObservable {
    List<Observer> observables = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observables.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator = observables.iterator();
        while (iterator.hasNext()) {
            Observer next = iterator.next();
            next.update(duck);
        }
    }
}

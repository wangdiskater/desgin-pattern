package headfirst.compound.composite;

import headfirst.compound.Quackable;
import headfirst.compound.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description
 * @ClassName Flock
 * @Author wangDi
 * @date 2020-12-10 15:23
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        System.out.println("Can i quack?");
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable next = (Quackable) iterator.next();
            next.quack();
        }
    }


    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable next = (Quackable) iterator.next();
            next.registerObserver(observer);
        }
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable next = (Quackable) iterator.next();
            next.notifyObserver();
        }
    }
}

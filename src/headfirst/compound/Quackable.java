package headfirst.compound;

import headfirst.compound.observer.QuackObservable;

/**
 * @Description
 * @ClassName Quackable
 * @Author wangDi
 * @date 2020-12-10 14:35
 */
//public interface Quackable {
// 观察者模式需要修改为可以观察的
public interface Quackable extends QuackObservable {
    public void quack();
}

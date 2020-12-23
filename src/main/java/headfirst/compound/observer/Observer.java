package headfirst.compound.observer;

import headfirst.compound.Quackable;

/**
 * @Description
 * @ClassName Observer
 * @Author wangDi
 * @date 2020-12-10 15:50
 */
public interface Observer {

    void update(QuackObservable subject);
}

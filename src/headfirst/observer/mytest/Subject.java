package headfirst.observer.mytest;


/**
 * @Description
 * @ClassName Subject
 * @Author wangDi
 * @date 2020-10-27 16:51
 */
public abstract class Subject {

    public abstract void registerObserver(MyObserver observer);
    public abstract void removeObserver(MyObserver observer);
    protected abstract void notifyObservers();

}

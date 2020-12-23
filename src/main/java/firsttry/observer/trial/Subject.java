package firsttry.observer.trial;

/**
 * @Description
 * @ClassName Subject
 * @Author wangDi
 * @date 2020-10-23 16:16
 */
public abstract class Subject {

    public abstract void addObserver(MyObserver myObserver);
    public abstract void removeObserver(MyObserver myObserver);
    public abstract void notifyAllObservers();
}

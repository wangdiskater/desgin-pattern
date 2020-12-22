package headfirst.compound.observer;


/**
 * @Description
 * @ClassName QuackObservable
 * @Author wangDi
 * @date 2020-12-10 15:42
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}

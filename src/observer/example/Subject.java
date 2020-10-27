package observer.example;

/**
 * @Description
 * @ClassName Subject
 * @Author wangdi
 * @date 2020-10-22 16:18
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}

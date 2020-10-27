package observer.example.imp.subject;

import observer.example.Observer;
import observer.example.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName HeadHunter
 * @Author wangDi
 * @date 2020-10-22 16:22
 */
public class HeadHunter implements Subject {
    List<Observer> userList = new ArrayList<>();
    List<String> jobs = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: userList){
            o.update(this);
        }
    }

    public void addJob(String jobName) {
        jobs.add(jobName);
        notifyObservers();

    }

    public List<String> getJobs() {
        return jobs;
    }

    @Override
    public String
    toString() {
        return "HeadHunter{" +
                "userList=" + userList +
                ", jobs=" + jobs +
                '}';
    }
}

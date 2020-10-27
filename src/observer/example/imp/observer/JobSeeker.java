package observer.example.imp.observer;

import observer.example.Observer;
import observer.example.Subject;
import observer.example.imp.subject.HeadHunter;

/**
 * @Description
 * @ClassName JobSeeker
 * @Author wangDi
 * @date 2020-10-22 16:21
 */
public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + " got notified!");
        //print job list
        HeadHunter headHunter = (HeadHunter) subject;
        System.out.println(headHunter.getJobs());
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "name='" + name + '\'' +
                '}';
    }
}

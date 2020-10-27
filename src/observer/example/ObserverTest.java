package observer.example;

import observer.example.imp.observer.JobSeeker;
import observer.example.imp.subject.HeadHunter;

/**
 * @Description The following is a typical example about head hunter. There are two roles in this diagram - HeadHunter and JobSeeker.
 * Job seekers subscribe to a head hunter, and head hunter notifies job seekers when there is a new job opportunity.
 *
 * @ClassName ObserverTest
 * @Author wangDi
 * @date 2020-10-22 16:15
 */
public class ObserverTest {

    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
        hh.registerObserver(new JobSeeker("Mike"));
        hh.registerObserver(new JobSeeker("Chris"));
        hh.registerObserver(new JobSeeker("Jeff"));


        hh.addJob("java 工程师");

    }

}

package observer.trial.imp.subject;

import observer.example.Observer;
import observer.trial.MyObserver;
import observer.trial.Packet;
import observer.trial.Subject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @ClassName MeiTuan
 * @Author wangDi
 * @date 2020-10-23 16:18
 */
public class MeiTuan extends Subject {

    Set<MyObserver> observers;

    List<Packet> packets;

    public MeiTuan() {
        observers = new HashSet<>();
        packets = new ArrayList<>();
    }

    @Override
    public void addObserver(MyObserver myObserver) {
        observers.add(myObserver);
    }

    @Override
    public void removeObserver(MyObserver myObserver) {
        observers.remove(myObserver);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(MyObserver::getPacket);

    }

    public void addPacket(Packet packet) {
        packets.add(packet);
        notifyAllObservers();
    }

}

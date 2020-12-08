package headfirst.proxy.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Description
 * @ClassName MyRemote
 * @Author wangDi
 * @date 2020-12-08 10:24
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;

}

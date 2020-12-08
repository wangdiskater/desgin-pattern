package headfirst.proxy.service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Description 记得启动register 放在out design目录下
 * @ClassName MyRemoteImpl
 * @Author wangDi
 * @date 2020-12-08 10:38
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "server says , hi";
    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl service = new MyRemoteImpl();
            // registry service
            Naming.bind("RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

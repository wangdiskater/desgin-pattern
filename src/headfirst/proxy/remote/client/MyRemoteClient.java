package headfirst.proxy.remote.client;

import headfirst.proxy.remote.service.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Description
 * @ClassName MyRemoteClient
 * @Author wangDi
 * @date 2020-12-08 10:58
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();

    }

    private void go() {
        String s = null;
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            s = service.sayHello();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println(s);

    }
}

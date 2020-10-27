package firsttry.observer.trial;

import firsttry.observer.trial.imp.observer.Courier;
import firsttry.observer.trial.imp.subject.MeiTuan;

/**
 * @Description 场景： 外卖小哥需要在服务平台上抢单
 * @ClassName MyObserver
 * @Author wangDi
 * @date 2020-10-23 16:08
 */
public class MyObserverTest {

    public static void main(String[] args) {
        MyObserver courier = new Courier("老哥");
        MyObserver courier2 = new Courier("憨批");
        MyObserver courier3 = new Courier("无名");

        MeiTuan meiTuan = new MeiTuan();
        meiTuan.addObserver(courier);
        meiTuan.addObserver(courier2);
        meiTuan.addObserver(courier3);
        meiTuan.addObserver(courier3);

        meiTuan.addPacket(new Packet());



    }

}

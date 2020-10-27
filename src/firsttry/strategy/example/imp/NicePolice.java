package firsttry.strategy.example.imp;

import firsttry.strategy.example.Strategy;

/**
 * @Description
 * @ClassName NicePolice
 * @Author wangDi
 * @date 2020-10-22 15:44
 */
public class NicePolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("This is your first time, be sure don't do it again!");

    }
}

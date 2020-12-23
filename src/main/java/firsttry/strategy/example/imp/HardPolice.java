package firsttry.strategy.example.imp;

import firsttry.strategy.example.Strategy;

/**
 * @Description
 * @ClassName HardPolice
 * @Author wangDi
 * @date 2020-10-22 15:43
 */
public class HardPolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("Your speed is "+ speed+ ", and should get a ticket!");

    }
}

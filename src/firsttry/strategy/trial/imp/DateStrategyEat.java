package firsttry.strategy.trial.imp;

import firsttry.strategy.trial.DateStrategy;

/**
 * @Description
 * @ClassName DateStrategyA
 * @Author wangDi
 * @date 2020-10-22 16:02
 */
public class DateStrategyEat implements DateStrategy {

    @Override
    public void run() {
        System.out.println("吃饭");
    }
}

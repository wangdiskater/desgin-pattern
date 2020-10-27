package strategy.trial.imp;

import strategy.trial.DateStrategy;

/**
 * @Description
 * @ClassName DateStrategyBuy
 * @Author wangDi
 * @date 2020-10-22 16:04
 */
public class DateStrategyBuy implements DateStrategy {
    @Override
    public void run() {
        System.out.println("买买买");
    }
}

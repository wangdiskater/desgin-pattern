package strategy.trial.imp;

import strategy.trial.DateStrategy;

/**
 * @Description
 * @ClassName DateStrategyB
 * @Author wangDi
 * @date 2020-10-22 16:02
 */
public class DateStrategyFilm implements DateStrategy {
    @Override
    public void run() {
        System.out.println("看电影");
    }
}

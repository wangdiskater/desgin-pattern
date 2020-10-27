package strategy.trial;

/**
 * @Description
 * @ClassName DateContext
 * @Author wangDi
 * @date 2020-10-22 16:05
 */
public class DateContext {
    private DateStrategy strategy;

    public DateContext(DateStrategy strategy) {
        this.strategy = strategy;
    }

    public DateStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(DateStrategy strategy) {
        this.strategy = strategy;
    }

    void run() {
        strategy.run();
    }


}

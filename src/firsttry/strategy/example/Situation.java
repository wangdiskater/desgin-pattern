package firsttry.strategy.example;

/**
 * @Description
 * @ClassName Situation
 * @Author wangDi
 * @date 2020-10-22 15:42
 */
public class Situation {
    private Strategy strategy;

    public Situation(Strategy strategy) {
        this.strategy = strategy;
    }

    void handleByPolice(int speed) {

        strategy.processSpeeding(speed);
    }

}

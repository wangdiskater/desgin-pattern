package firsttry.strategy.trial;

import firsttry.strategy.trial.imp.DateStrategyBuy;
import firsttry.strategy.trial.imp.DateStrategyEat;
import firsttry.strategy.trial.imp.DateStrategyFilm;
import firsttry.strategy.trial.imp.DateStrategyPiano;

/**
 * @Description 策略模式：就好像我们有一大堆工具箱，每个箱子装不同的东西，我们需要在一个context里面从每个箱子里面拿出不同的东西进行拼装。
 * 更灵活的是：可以在上下文中。来回切换不同的策略
 *
 * 例子：比如今天要和三个妹子约会，如何去选择
 *
 * @ClassName MyStrategy
 * @Author wangDi
 * @date 2020-10-22 15:55
 */
public class MyStrategy {

    public static void main(String[] args) {

        System.out.println("上午 ---- 和A");
        DateContext context = new DateContext(new DateStrategyEat());
        context.run();

        System.out.println("中午 ---- 和B");
        context.setStrategy(new DateStrategyBuy());
        context.run();

        System.out.println("下午 ---- 和C");
        context.setStrategy(new DateStrategyFilm());
        context.run();


        System.out.println("晚上 ---- 回到A");
        context.setStrategy(new DateStrategyPiano());
        context.run();



    }
}

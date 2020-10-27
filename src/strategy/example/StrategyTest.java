package strategy.example;

import strategy.example.imp.HardPolice;
import strategy.example.imp.NicePolice;

/**
 * @Description Here is a story about Strategy pattern. Suppose Mike sometimes speeds when driving, but he doesn't always do that.
 * He may be stopped by a police officer. It's possible that the police is very nice, who would let him go without any ticket or with a simple warning.
 * (Let call this kind of police "NicePolice".) Also it's possible that he may be caught by a hard police and gets a ticket. (Let's call this kind of police "HardPolice".)
 * He doesn't know what kind of police would stop him, until he actually gets caught, that is, run-time. This is the whole point of Strategy pattern.
 * @ClassName StrategyTest
 * @Author wangDi
 * @date 2020-10-22 15:35
 */
public class StrategyTest {
    public static void main(String[] args) {
        HardPolice hp = new HardPolice();
        NicePolice ep = new NicePolice();

        // In situation 1, a hard officer is met
        // In situation 2, a nice officer is met
        Situation s1 = new Situation(hp);
        Situation s2 = new Situation(ep);

        //the result based on the kind of police officer.
        s1.handleByPolice(10);
        s2.handleByPolice(10);
    }

}

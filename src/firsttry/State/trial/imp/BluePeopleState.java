package firsttry.State.trial.imp;

import firsttry.State.trial.PeopleState;
import firsttry.State.trial.WarContext;

/**
 * @Description
 * @ClassName BluePeopleState
 * @Author wangDi
 * @date 2020-10-21 17:14
 */
public class BluePeopleState implements PeopleState {
    @Override
    public void fight(WarContext warContext) {
        System.out.println("蓝色的奥特曼，还是菜的一，切换红灯");
        warContext.changeState(new RedPeopleState());
    }
}

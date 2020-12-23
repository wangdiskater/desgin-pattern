package firsttry.State.trial.imp;

import firsttry.State.trial.PeopleState;
import firsttry.State.trial.WarContext;

/**
 * @Description
 * @ClassName NormalPeopleState
 * @Author wangDi
 * @date 2020-10-21 17:13
 */
public class NormalPeopleState implements PeopleState {
    @Override
    public void fight(WarContext warContext) {
        System.out.println("菜的扣脚,先变个身");
        warContext.changeState(new BluePeopleState());
    }
}

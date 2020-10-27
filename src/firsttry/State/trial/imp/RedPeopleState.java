package firsttry.State.trial.imp;

import firsttry.State.trial.PeopleState;
import firsttry.State.trial.WarContext;

/**
 * @Description
 * @ClassName RedPeopleState
 * @Author wangDi
 * @date 2020-10-21 17:15
 */
public class RedPeopleState implements PeopleState {
    @Override
    public void fight(WarContext warContext) {
        System.out.println("红灯，可以操作,但是只能5分钟变成人");
        warContext.changeState(new NormalPeopleState());
    }
}

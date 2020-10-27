package State.trial;

import State.trial.imp.NormalPeopleState;

/**
 * @Description
 * @ClassName WarContext
 * @Author wangDi
 * @date 2020-10-21 17:15
 */
public class WarContext {

    private PeopleState peopleState;

    public void init() {
        peopleState = new NormalPeopleState();
    }

    public void changeState(PeopleState peopleState) {
        this.peopleState = peopleState;
    }

    public void fight(){
        peopleState.fight(this);
    }

}

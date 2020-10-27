package State.example;

import State.example.imp.Poor;

/**
 * @Description
 * @ClassName StateContext
 * @Author wangDi
 * @date 2020-10-21 16:24
 */
public class StateContext {
    private State currentState;

    public StateContext() {
        currentState = new Poor();
    }

    public void changeState(State state){
        currentState = state;
    }

    public void saySomething(){
        currentState.saySomeThing(this);
    }

}

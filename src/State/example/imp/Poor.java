package State.example.imp;

import State.example.State;
import State.example.StateContext;

/**
 * @Description
 * @ClassName Poor
 * @Author wangDi
 * @date 2020-10-21 16:29
 */
public class Poor implements State {
    @Override
    public void saySomeThing(StateContext stateContext) {
        System.out.println("poor currently");
        stateContext.changeState(new Rich());

    }
}

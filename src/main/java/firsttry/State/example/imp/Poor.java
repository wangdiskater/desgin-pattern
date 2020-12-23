package firsttry.State.example.imp;

import firsttry.State.example.State;
import firsttry.State.example.StateContext;

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

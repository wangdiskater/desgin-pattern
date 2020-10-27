package firsttry.State.example.imp;

import firsttry.State.example.State;
import firsttry.State.example.StateContext;

/**
 * @Description
 * @ClassName Rich
 * @Author wangDi
 * @date 2020-10-21 16:30
 */
public class Rich implements State {
    @Override
    public void saySomeThing(StateContext stateContext) {
        System.out.println("rich currently");
        stateContext.changeState(new Poor());
    }
}

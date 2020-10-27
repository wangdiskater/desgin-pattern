package command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName Switch
 * @Author wangDi
 * @date 2020-10-13 11:53
 */
public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }


    public void storeAndExecute(Command command) {
        // optional, can do the execute only!
        this.history.add(command);
        command.execute();
    }
}

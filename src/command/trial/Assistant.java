package command.trial;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName Assistant
 * @Author wangDi
 * @date 2020-10-13 14:12
 */
public class Assistant {

    List<MyCommand> commandList = new ArrayList<>();

    void storeAndSaveCommand(MyCommand myCommand) {
        commandList.add(myCommand);
        myCommand.excute();
    }
}

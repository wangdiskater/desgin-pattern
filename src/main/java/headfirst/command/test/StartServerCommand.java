package headfirst.command.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName StartServerCommand
 * @Author wangDi
 * @date 2020-11-12 11:43
 */
public class StartServerCommand extends MyCommand {

    private List<String> data = new ArrayList<>();

    @Override
    public void execute() {
        // 加载数据
        data.add(DataCenter.DATA1.getData());
        System.out.println("start server");
    }

    @Override
    public void store() {
        // 保存数据到数据库
        System.out.println("store command");
    }

    @Override
    public void load() {
        // 重新加载数据库数据
//        data = List.of(DataCenter.DATA1.getData());
    }
}

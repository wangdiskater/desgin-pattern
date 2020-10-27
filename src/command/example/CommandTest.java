package command.example;

import command.example.imp.RestartCommand;
import command.example.imp.ShutDownCommand;

/**
 * 通过switch把 client和receiver解耦，1）invoker就是switch，2）receiver就是computer,3）client是用户，4）command
 *
 * @Description Command design pattern takes an operation and its arguments and wraps them up in an object to be executed, logged, etc.
 * In the example below, Command is an operation, its argument is a Computer, and they are wrapped in Switch.
 *
 * @ClassName CommandTest
 * @Author wangDi
 * @date 2020-10-13 11:55
 */
public class CommandTest {

    /* main function The client */
    public static void main(String[] args) {
        // receiver
        Computer computer = new Computer();

        // command
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        // invoker
        Switch s = new Switch();

        String str = "shutdown"; //get value based on real situation

        if(str.equals( "shutdown")){
            s.storeAndExecute(shutdown);
        }else{
            s.storeAndExecute(restart);
        }
    }
}

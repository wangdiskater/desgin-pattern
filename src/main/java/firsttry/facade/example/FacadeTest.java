package firsttry.facade.example;

/**
 * @Description
 * Facade design pattern hides complexity of a task and provides a simple interface. The startup of a computer is a good example. When a computer starts up,
 * it involves the work of cpu, memory, hard drive, etc. To make it easy to use for users, we can add a firsttry.facade which wrap the complexity of the task, and provide one simple interface instead.
 *
 * @ClassName FacadeTest
 * @Author wangDi
 * @date 2020-10-14 16:39
 */
public class FacadeTest {

    public static void main(String[] args) {

        Computer computer = new Computer(new CPU(),new Memory(),new HardDrive());

        computer.run();
    }
}

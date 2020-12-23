package firsttry.facade.example;

/**
 * @Description
 * @ClassName Computer
 * @Author wangDi
 * @date 2020-10-14 16:38
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    void run() {
        cpu.processData();
        memory.load();
        hardDrive.readData();
    }


}

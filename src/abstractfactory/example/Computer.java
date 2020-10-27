package abstractfactory.example;

/**
 * @Description 把东西和工厂连接起来
 * @ClassName Computer
 * @Author wangDi
 * @date 2020-10-15 11:38
 */
public class Computer {
    private CPU cpu;

    public Computer(CpuFactory cpuFactory) {
        this.cpu = cpuFactory.produce();
    }

    public CPU getCpu() {
        return cpu;
    }
}

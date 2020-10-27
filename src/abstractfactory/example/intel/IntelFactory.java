package abstractfactory.example.intel;

import abstractfactory.example.CPU;
import abstractfactory.example.CpuFactory;

/**
 * @Description
 * @ClassName IntelFactory
 * @Author wangDi
 * @date 2020-10-15 11:31
 */
public class IntelFactory extends CpuFactory {
    public IntelFactory() {

    }

    @Override
    public CPU produce() {
        return new IntelCPU();
    }
}

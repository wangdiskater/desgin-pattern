package abstractfactory.example.amd;

import abstractfactory.example.CPU;
import abstractfactory.example.CpuFactory;

/**
 * @Description
 * @ClassName AMDFactory
 * @Author wangDi
 * @date 2020-10-15 11:35
 */
public class AMDFactory extends CpuFactory {
    @Override
    public CPU produce() {

        return new AMDCPU();
    }
}

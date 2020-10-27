package firsttry.abstractfactory.example.amd;

import firsttry.abstractfactory.example.CPU;
import firsttry.abstractfactory.example.CpuFactory;

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

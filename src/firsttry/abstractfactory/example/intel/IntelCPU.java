package firsttry.abstractfactory.example.intel;

import firsttry.abstractfactory.example.CPU;

/**
 * @Description
 * @ClassName IntelCPU
 * @Author wangDi
 * @date 2020-10-15 11:33
 */
public class IntelCPU extends CPU {
    @Override
    public void process() {
        System.out.println("intel cpu");
    }
}

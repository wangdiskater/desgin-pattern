package abstractfactory.example.amd;

import abstractfactory.example.CPU;

/**
 * @Description
 * @ClassName AMDCPU
 * @Author wangDi
 * @date 2020-10-15 11:35
 */
public class AMDCPU extends CPU {
    @Override
    public void process() {
        System.out.println("amd cpu");
    }
}

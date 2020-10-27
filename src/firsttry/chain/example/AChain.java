package firsttry.chain.example;

/**
 * @Description
 * @ClassName AChain
 * @Author wangDi
 * @date 2020-10-10 16:46
 */
public class AChain extends Chain {
    public AChain(int threshold) {
        this.Threshold = threshold;
    }
    @Override
    protected void writeMessage(String msg) {
        System.out.println("A: " + msg);
    }
}

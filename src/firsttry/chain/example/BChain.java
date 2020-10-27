package firsttry.chain.example;

/**
 * @Description
 * @ClassName BChain
 * @Author wangDi
 * @date 2020-10-10 16:46
 */
public class BChain extends Chain {
    public BChain(int threshold) {
        this.Threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("B: " + msg);
    }}

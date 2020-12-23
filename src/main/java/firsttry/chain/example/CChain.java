package firsttry.chain.example;

/**
 * @Description
 * @ClassName BChain
 * @Author wangDi
 * @date 2020-10-10 16:46
 */
public class CChain extends Chain {
    public CChain(int threshold) {
        this.Threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("C: " + msg);
    }}

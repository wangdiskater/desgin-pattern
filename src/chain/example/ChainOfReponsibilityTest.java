package chain.example;

/**
 * @Description 责任链模式
 * The main idea of Chain of Responsibility design pattern is to build a chain of processing unit,
 * each unit handle the request if threshold is satisfied. Since a chain is built, if one unit is not satisfied,
 * it's next unit will be tested, and so on. Each request will be process along the chain.
 *
 * @ClassName ChainOfReponsibilityTest
 * @Author wangDi
 * @date 2020-10-10 16:27
 */
public class ChainOfReponsibilityTest {
    private static Chain createChain() {
        // Build the chain of responsibility

        Chain chain1 = new AChain(Chain.Three);

        Chain chain2 = new BChain(Chain.Two);
        chain1.setNext(chain2);

        Chain chain3 = new CChain(Chain.One);
        chain2.setNext(chain3);

        return chain1;
    }

    public static void main(String[] args) {

        Chain chain = createChain();

        chain.message("level 3", Chain.Three);

        chain.message("level 2", Chain.Two);

        chain.message("level 1", Chain.One);
    }
}

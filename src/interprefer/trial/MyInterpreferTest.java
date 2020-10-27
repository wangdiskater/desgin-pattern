package interprefer.trial;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  i love you 翻译成我爱你
 * @ClassName MyInterpreferTest
 * @Author wangDi
 * @date 2020-10-13 09:56
 */
public class MyInterpreferTest {

    public static void main(String[] args) {
        List<Expression> interPrefer = new ArrayList<>();
        AExpression aExpression = new AExpression();
        BExpression bExpression = new BExpression();
        CExpression cExpression = new CExpression();
        String str = "i love you";
        interPrefer.add(aExpression);
        interPrefer.add(bExpression);
        interPrefer.add(cExpression);

        Context context = new Context(str);
        interPrefer.forEach(expression -> {
            expression.interpret(context);
        });

        System.out.println(context);
    }
}

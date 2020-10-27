package firsttry.interprefer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Interpreter pattern is used when some context needs to be interpreted. The following example is a very simple Interpreter implementation.
 * It interpretes letter "a" and "b" to "1" and "2".
 * @ClassName InterpreferTest
 * @Author wangdi
 * @date 2020-10-10 11:27
 */
public class InterpreferTest {

    public static void main(String[] args) {
        String str = "ab";
        Context context = new Context();
        context.setInput(str);

        List<Expression> list = new ArrayList<>();
        list.add(new AExpression());
        list.add(new BExpression());

        for(Expression ex : list) {
            ex.interpret(context);
        }

        System.out.println(context.getOutput());
    }

}

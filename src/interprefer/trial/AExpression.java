package interprefer.trial;


/**
 * @Description
 * @ClassName AExpression
 * @Author wangDi
 * @date 2020-10-13 09:57
 */
public class AExpression implements Expression {


    @Override
    public void interpret(Context context) {
        String output = context.getOutput();
        if (output == null || "".equals(output)) {
            String input = context.getInput();
            String replace = input.replace("i", "我");
            context.setOutput(replace);
        } else {
            String replace = context.getOutput().replace("i", "我");
            context.setOutput(replace);
        }
    }
}

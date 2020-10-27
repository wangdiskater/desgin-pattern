package interprefer.trial;


/**
 * @Description
 * @ClassName AExpression
 * @Author wangDi
 * @date 2020-10-13 09:57
 */
public class BExpression implements Expression {


    @Override
    public void interpret(Context context) {
        String output = context.getOutput();
        if (output == null || "".equals(output)) {
            String input = context.getInput();
            String replace = input.replace("you", "你");
            context.setOutput(replace);
        } else {
            String replace = context.getOutput().replace("you", "你");
            context.setOutput(replace);
        }
    }
}

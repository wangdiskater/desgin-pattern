package interprefer.example;

/**
 * @Description
 * @ClassName AExpression
 * @Author wangdi
 * @date 2020-10-10 11:31
 */
public class AExpression implements Expression {
    @Override
    public void interpret(Context context) {
        String output = context.getOutput();
        if (output == null || output.length() == 0) {
            String input = context.getInput();
            output = input.replace("a", "1");
        } else {
            output = output.replace("a", "1");
        }
        context.setOutput(output);
    }
}

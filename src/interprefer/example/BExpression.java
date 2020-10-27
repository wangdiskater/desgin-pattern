package interprefer.example;

/**
 * @Description
 * @ClassName BExpression
 * @Author wangdi
 * @date 2020-10-10 11:31
 */
public class BExpression implements Expression {
    @Override
    public void interpret(Context context) {
        String output = context.getOutput();
        if (output == null || output.length() == 0) {
            String input = context.getInput();
            output = input.replace("b", "2");
        } else {
            output = output.replace("b", "2");
        }
        context.setOutput(output);
    }
}

package interprefer.example;

/**
 * @Description
 * @ClassName Context
 * @Author wangdi
 * @date 2020-10-10 11:27
 */
public class Context {
    private String input;
    private String output;

    public Context() {
    }

    public Context(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}

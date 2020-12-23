package firsttry.builder.trial;

/**
 * @Description
 * @ClassName Piano
 * @Author wangDi
 * @date 2020-10-12 17:37
 */
public class Piano {
    /**
     * 特性
     */
    private String outLook;

    /**
     * 共性
     */
    // 弦
    private String string;

    private String keyboard;

    public Piano() {
    }

    public String getOutLook() {
        return outLook;
    }

    public void setOutLook(String outLook) {
        this.outLook = outLook;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Piano{" +
                "outLook='" + outLook + '\'' +
                ", string='" + string + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}

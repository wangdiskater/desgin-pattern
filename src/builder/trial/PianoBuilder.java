package builder.trial;

/**
 * @Description
 * @ClassName PianoBuilder
 * @Author wangDi
 * @date 2020-10-12 17:40
 */
public abstract class PianoBuilder {
    private Piano piano;

    public Piano getPiano() {
        return piano;
    }

    /**
     * 共性初始化
     */
    void createPiano(){
        piano = new Piano();
        piano.setKeyboard("结实的琴键");
        piano.setString("钢线");
    }

    public abstract void buildOutLook();
}

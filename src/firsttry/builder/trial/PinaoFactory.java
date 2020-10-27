package firsttry.builder.trial;

/**
 * @Description
 * @ClassName PinaoFactory
 * @Author wangDi
 * @date 2020-10-12 17:46
 */
public class PinaoFactory {
    private PianoBuilder pianoBuilder;

    public PianoBuilder getPianoBuilder() {
        return pianoBuilder;
    }

    public void setPianoBuilder(PianoBuilder pianoBuilder) {
        this.pianoBuilder = pianoBuilder;
    }

    void create() {

        pianoBuilder.createPiano();

        // 个性初始化
        pianoBuilder.buildOutLook();
    }
}

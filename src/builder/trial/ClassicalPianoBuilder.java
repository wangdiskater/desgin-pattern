package builder.trial;

/**
 * @Description
 * @ClassName ClassicalPiano
 * @Author wangDi
 * @date 2020-10-12 17:44
 */
public class ClassicalPianoBuilder extends PianoBuilder {
    @Override
    public void buildOutLook() {
        System.out.println("古典钢琴");
        getPiano().setOutLook("传统烤漆");
    }
}

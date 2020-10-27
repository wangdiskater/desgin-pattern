package firsttry.builder.trial;

/**
 * @Description
 * @ClassName EletricPiano
 * @Author wangDi
 * @date 2020-10-12 17:45
 */
public class EletricPianoBuilder extends PianoBuilder {
    @Override
    public void buildOutLook() {
        System.out.println("电钢琴的表面");
        getPiano().setOutLook("一般都是木头的表面");

    }
}

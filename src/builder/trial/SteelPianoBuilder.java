package builder.trial;

/**
 * @Description
 * @ClassName SteelPiano
 * @Author wangDi
 * @date 2020-10-12 17:43
 */
public class SteelPianoBuilder extends PianoBuilder {
    @Override
    public void buildOutLook() {
        System.out.println("钢的琴，一定要钢的外观");
        getPiano().setOutLook("钢的外观");
    }

}

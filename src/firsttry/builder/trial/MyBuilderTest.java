package firsttry.builder.trial;

/**
 * @Description 做一个钢的琴
 * @ClassName MyBuilderTest
 * @Author wangDi
 * @date 2020-10-12 17:36
 */
public class MyBuilderTest {

    public static void main(String[] args) {
        System.out.println("爸爸，我想要一台钢的琴!");

        PinaoFactory pinaoFactory = new PinaoFactory();
        SteelPianoBuilder pianoBuilder = new SteelPianoBuilder();
        pinaoFactory.setPianoBuilder(pianoBuilder);
        pinaoFactory.create();
        Piano piano = pianoBuilder.getPiano();
        System.out.println(piano);
    }
}

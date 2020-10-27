package decorator.example;

/**
 * @Description
 *
 * Let's assume you are looking for a girlfriend. There are girls from different countries such as America, China, Japan, France, etc.
 * They may have different personalities and hobbies. In a dating web like eharmony.com, if each type of girl is an individual Java class,
 * there would be thousands of classes. That is a serious problem called class explosion. Moreover, this design is not extensible.
 * Whenever there is a new girl type, a new class needs to be created.
 *
 * @ClassName DecoratorTest
 * @Author wangDi
 * @date 2020-10-15 16:01
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());


        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }

}

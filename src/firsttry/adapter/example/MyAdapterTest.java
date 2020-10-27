package firsttry.adapter.example;

/**
 * @Description The Adapter idea can be demonstrated with the following simple example.
 * The purpose of the sample problem is to adapt an orange as an apple.
 *
 * apple是我们原本的，orange就是我们旧有的，希望能使用apple的方法，和apple有相同的行为
 *
 * @ClassName MyAdapterTest
 * @Author wangDi
 * @date 2020-10-20 17:38
 */
public class MyAdapterTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        apple1.getAColor("green");

        Orange orange = new Orange();

        AppleAdapter appleAdapter = new AppleAdapter(orange);

        appleAdapter.getAColor("red");

    }
}

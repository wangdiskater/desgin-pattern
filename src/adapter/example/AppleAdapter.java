package adapter.example;

/**
 * @Description
 * @ClassName AppleAdapter
 * @Author wangDi
 * @date 2020-10-20 19:35
 */
public class AppleAdapter {

    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    public void getAColor(String str) {
        orange.getOColor(str);
    }
}

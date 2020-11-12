package headfirst.command.example.stereo;

/**
 * @Description
 * @ClassName Stereo
 * @Author wangDi
 * @date 2020-11-12 10:49
 */
public class Stereo {
    private CD cd;
    private int volume;

    void on() {
        System.out.println("switch on  stereo");
    }
    void off() {
        System.out.println("off  stereo");
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

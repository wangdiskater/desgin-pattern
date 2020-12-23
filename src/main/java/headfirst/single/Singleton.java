package headfirst.single;

/**
 * @Description
 * @ClassName Singleton
 * @Author wangDi
 * @date 2020-11-11 14:15
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    /**
     * 双重锁
     * double check
     * @return
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

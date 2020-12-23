package headfirst.proxy.dynamic;

/**
 * @Description
 * @ClassName PersonBean
 * @Author wangDi
 * @date 2020-12-10 10:33
 */
public interface PersonBean {
    void setHotOrNotRating(int rating);
    int getHotOrNotRating();

    void setName(String name);
    String getName();
}

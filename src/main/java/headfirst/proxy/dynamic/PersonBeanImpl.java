package headfirst.proxy.dynamic;

/**
 * @Description
 * @ClassName PersonBeanImpl
 * @Author wangDi
 * @date 2020-12-10 10:35
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    private int rating;
    private int ratingCount = 0;

    public PersonBeanImpl(String name) {
        this.name = name;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating = rating;
        ratingCount++;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating/ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

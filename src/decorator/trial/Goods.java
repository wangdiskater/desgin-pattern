package decorator.trial;

/**
 * @Description
 * @ClassName Goods
 * @Author wangDi
 * @date 2020-10-19 11:27
 */
public abstract class Goods {
    private String name;
    private String feature;
    private Boolean wraped;
    private Boolean addressed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Boolean getWraped() {
        return wraped;
    }

    public void setWraped(Boolean wraped) {
        this.wraped = wraped;
    }

    public Boolean getAddressed() {
        return addressed;
    }

    public void setAddressed(Boolean addressed) {
        this.addressed = addressed;
    }

    public void introduce() {
        String introduce = "我叫%s,我的功能是：%s";
        System.out.println(String.format(introduce, name, feature));
    }
}

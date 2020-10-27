package template.trial;

/**
 * @Description
 * @ClassName Player
 * @Author wangDi
 * @date 2020-10-16 14:15
 */
public abstract class Player {

    private Boolean hasMp;

    private Boolean hasHp;

    public Boolean getHasMp() {
        return hasMp;
    }

    public void setHasMp(Boolean hasMp) {
        this.hasMp = hasMp;
    }

    public Boolean getHasHp() {
        return hasHp;
    }

    public void setHasHp(Boolean hasHp) {
        this.hasHp = hasHp;
    }

    abstract void walk();

    abstract void jump();

    abstract void pick();

    abstract void attack();


    public void start() {
        if (hasHp) {
            walk();
            jump();
            pick();
        }

        if (hasMp) {
            attack();
        }

    }

}

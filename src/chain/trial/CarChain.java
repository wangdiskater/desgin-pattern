package chain.trial;

/**
 * @Description
 * @ClassName CarChain
 * @Author wangDi
 * @date 2020-10-10 17:03
 */
public abstract class CarChain {

    /**
     * 标志是否创建好了
     */
    boolean finished;
    /**
     * 下一道工序
     */
    CarChain nextChain;

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public CarChain getNextChain() {
        return nextChain;
    }

    public void setNextChain(CarChain nextChain) {
        this.nextChain = nextChain;
    }



    /**
     * 核心方法：产业链控制
     * @param car
     */
    public void create(Car car) {

        if (nextChain != null) {
            nextChain.create(car);
        }
        //if the priority is less than Threshold it is handled
        if (!finished) {
            addCarFunction(car);
        } else {
            return;
        }
    }

    abstract void addCarFunction(Car car);
}

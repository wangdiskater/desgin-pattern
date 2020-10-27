package template.example;

/**
 * @Description
 * @ClassName Vehicle
 * @Author wangDi
 * @date 2020-10-15 11:51
 */
public abstract class Vehicle {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    abstract void start();
    abstract void run();
    abstract void stop();

    /**
     * 所有的逻辑都已经定死了，流程
     *
     */
    void testYourVehicle(){
        start();
       if (status) {
           run();
           stop();
       }


    }
}

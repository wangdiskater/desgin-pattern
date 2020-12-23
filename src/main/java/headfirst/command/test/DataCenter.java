package headfirst.command.test;

/**
 * @Description
 * @ClassName DataCenter
 * @Author wangdi
 * @date 2020-11-12 11:45
 */
public enum DataCenter {
    /**
     * 假设数据存在数据库中
     */
    DATA1("数据1"),
    ;
    private String data;

    DataCenter(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

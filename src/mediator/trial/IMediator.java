package mediator.trial;

/**
 * @Description
 * @ClassName IMediator
 * @Author wangdi
 * @date 2020-10-13 11:19
 */
public interface IMediator {
    void buy();

    void sell();

    /**
     * 这两个登记的作用是什么？
     */
    void registerBuyer(People people);

    void registerSeller(People people);

}

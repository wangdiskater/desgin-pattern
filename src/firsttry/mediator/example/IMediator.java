package firsttry.mediator.example;

/**
 * @Description
 * @ClassName IMediator
 * @Author wangdi
 * @date 2020-10-13 10:41
 */
public interface IMediator {
    void fight();
    void talk();

    void registerA(Colleague colleague);
    void registerB(Colleague colleague);
}

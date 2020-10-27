package State.example;

/**
 * @Description People can live with different financial status.
 * They can be rich or they can be poor. The two states - rich and poor - can be converted to each other from time to time.
 * The idea behind the example: people normally work harder when they are poor and play more when they are rich.
 * What they do depends on the state in which they are living. The state can be changed based on their actions, otherwise, the society is not fair.
 *
 * 状态的切换，在每一个状态中。
 * @ClassName StateTest
 * @Author wangDi
 * @date 2020-10-21 16:21
 */
public class StateTest {

    public static void main(String args[]){
        StateContext sc = new StateContext();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
    }
}

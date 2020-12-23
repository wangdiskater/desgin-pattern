package firsttry.mediator.example;

import firsttry.mediator.example.imp.ConcreteMediator;

/**
 * @Description
 * Mediator design pattern is used to collaborate a set of colleagues. Those colleagues do not communicate with each other directly, but through the firsttry.mediator.
 * In the example below, Colleague A want to talk, and Colleague B wants to fight. When they do some action(i.e., doSomething()), they invoke firsttry.mediator to do that.
 * @ClassName MediatorTest
 * @Author wangDi
 * @date 2020-10-13 10:37
 */
public class MediatorTest {

    public static void main(String[] args) {
        IMediator concreteMediator = new ConcreteMediator();


        ColleagueA colleagueA = new ColleagueA(concreteMediator);
        ColleagueB colleagueB = new ColleagueB(concreteMediator);

        colleagueA.doSomeThing();
        colleagueB.doSomeThing();
    }

}

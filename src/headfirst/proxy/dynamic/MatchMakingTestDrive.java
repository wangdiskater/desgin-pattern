package headfirst.proxy.dynamic;

/**
 * @Description
 * @ClassName MatchMakingTestDrive
 * @Author wangDi
 * @date 2020-12-10 10:57
 */
public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setName("another name");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can’t set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setName("王D");
        } catch (Exception e) {
            System.out.println("Can’t set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean personBean) {
        return NonOwnerInvocationHandler.getNonOwnerProx(personBean);
    }

    private PersonBean getOwnerProxy(PersonBean personBean) {
        return OwnerInvocationHandler.getOwnerProxy(personBean);
    }
}

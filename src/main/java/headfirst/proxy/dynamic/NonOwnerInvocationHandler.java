package headfirst.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @ClassName OwnerInvocationHandler
 * @Author wangDi
 * @date 2020-12-10 10:33
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.getName().equals("setHotOrNotRating") && method.getName().startsWith("set")) {
            throw new IllegalArgumentException("不能操作别人除分出外的选项");
        } else {
            return method.invoke(person, args);
        }
    }

    static PersonBean getNonOwnerProx(PersonBean person) {
        PersonBean proxyBean = (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
        return proxyBean;
    }
}

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
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalArgumentException("不能操作自己的分数");
        } else {
            return method.invoke(person, args);
        }
    }

    static PersonBean  getOwnerProxy(PersonBean person) {
        PersonBean proxyBean = (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
        return proxyBean;
    }
}

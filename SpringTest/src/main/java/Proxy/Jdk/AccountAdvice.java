package Proxy.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountAdvice implements InvocationHandler {
    // 目标对象
    private IAccountService target;

    public AccountAdvice(IAccountService target) {
        this.target = target;
    }

    /**
     * 代理方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         System.out.println("before");
        return method.invoke(target,args);
    }
}

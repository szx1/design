package cn.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zengxi.song
 * @date 2023/5/19
 */
public class ConcreteHandler implements InvocationHandler {

    private final Subject target;

    public ConcreteHandler(Subject target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行");
        return method.invoke(target, args);
    }
}

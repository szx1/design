package cn.design.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zengxi.song
 * @date 2023/6/1
 */
public class ConcreteMethodInterceptor implements MethodInterceptor {
    /**
     * 被代理的真实对象
     */
    private Object object;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
//        Object invoke = method.invoke(object, args);
        Object invoke = methodProxy.invoke(object, args);
        after();
        return invoke;
    }

    /**
     * 自定义获取代理对象方法(通过Enhancer)
     *
     * @param objectTarget
     * @return
     */
    public Object getCglibProxy(Object objectTarget) {
        // 为目标对象target赋值
        this.object = objectTarget;
        Enhancer enhancer = new Enhancer();
        // 设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        // 对于代理类所有的方法回调都会调用callback，callback需要实现MethodInterceptor接口
        enhancer.setCallback(this);
        // 创建并返回代理对象
        return enhancer.create();
    }

    private void before() {
        System.out.println("前置增强执行...");
    }

    private void after() {
        System.out.println("后置增强执行...");
    }
}

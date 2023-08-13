package cn.design.proxy;

import net.sf.cglib.core.DebuggingClassWriter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zengxi.song
 * @date 2023/1/10
 */
public class Test {

    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Proxy proxy = new Proxy(new RealSubject());
//        proxy.doSomething();

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        System.out.println(Arrays.toString(Subject.class.getInterfaces()));
//        InvocationHandler concreteHandler = new ConcreteHandler(new RealSubject());
//        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), RealSubject.class.getInterfaces(), concreteHandler);
//        System.out.println(subject.getClass().getName());
//        System.out.println(subject);
//        System.gc();
//        System.runFinalization();
//        System.gc();
//        Thread.sleep(60000L);
//        subject.doSomething("szx");
//        Subject subject2 = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), RealSubject.class.getInterfaces(), new ConcreteHandler(new RealSubject()));
//        System.out.println(subject2.getClass().getName());

//        System.out.println(System.getProperty("user.dir"));
////        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.dir"));
//        ConcreteMethodInterceptor concreteMethodInterceptor = new ConcreteMethodInterceptor();
//        Subject cglibProxy = (Subject) concreteMethodInterceptor.getCglibProxy(new RealSubject());
//        cglibProxy.doSomething("szx");
        Method doSomething = RealSubject.class.getMethod("doSomething", String.class);
        RealSubject realSubject = new RealSubject();
        for (int i = 0; i < 17; i++) {
            doSomething.invoke(realSubject, "szx");
        }
    }
}

package cn.design.proxy;

/**
 * @author zengxi.song
 * @date 2023/1/10
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String name) {
        System.out.println("真实主题执行方法" + name);
    }
}

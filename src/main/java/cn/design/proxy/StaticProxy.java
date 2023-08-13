package cn.design.proxy;

/**
 * @author zengxi.song
 * @date 2023/1/10
 */
public class StaticProxy implements Subject {
    private Subject realSubject;

    public StaticProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething(String name) {
        preProcess();
        realSubject.doSomething(name);
        postProcess();
    }

    private void preProcess() {
        System.out.println("前置处理");
    }

    private void postProcess() {
        System.out.println("后置处理");
    }
}

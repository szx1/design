package cn.design.adapter;

/**
 * @author zengxi.song
 * @date 2022/12/8
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output22V() {
        return adaptee.output() / 10;
    }
}

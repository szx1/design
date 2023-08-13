package cn.design.adapter;

/**
 * @author zengxi.song
 * @date 2022/12/8
 */
public class Adapter extends Adaptee implements Target {


    @Override
    public int output22V() {
        return super.output() / 10;
    }
}

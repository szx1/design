package cn.design.decorator;

/**
 * @author zengxi.song
 * @date 2022/12/19
 */
public class Coffee implements Drink {
    @Override
    public Integer cost() {
        return 12;
    }
}

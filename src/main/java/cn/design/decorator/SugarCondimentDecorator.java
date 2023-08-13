package cn.design.decorator;

/**
 * @author zengxi.song
 * @date 2022/12/19
 */
public class SugarCondimentDecorator extends CondimentDecorator {

    public SugarCondimentDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}

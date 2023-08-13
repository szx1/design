package cn.design.decorator;

/**
 * @author zengxi.song
 * @date 2022/12/19
 */
public abstract class CondimentDecorator implements Drink {

    private final Drink drink;

    public CondimentDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Integer cost() {
        return drink.cost();
    }
}

package cn.design.decorator;



/**
 * @author zengxi.song
 * @date 2022/12/19
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Drink drink = new Coffee();
        MilkCondimentDecorator milkDrink = new MilkCondimentDecorator(drink);
        HoneyCondimentDecorator honeyMilkDrink = new HoneyCondimentDecorator(milkDrink);
        System.out.println(honeyMilkDrink.cost());

        Drink drink2 = new Tea();
        SugarCondimentDecorator sugarDrink = new SugarCondimentDecorator(drink2);
        MilkCondimentDecorator sugarMilkDrink = new MilkCondimentDecorator(sugarDrink);
        System.out.println(sugarMilkDrink.cost());

        HoneyCondimentDecorator honeyCondimentDecorator = new HoneyCondimentDecorator(new MilkCondimentDecorator(new Coffee()));
        System.out.println(honeyCondimentDecorator.cost());
    }
}

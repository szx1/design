package cn.design.builder;


/**
 * @author zengxi.song
 * @date 2022/10/18
 */
public class ConcreteBuilder implements Builder {

    private final Product product = new Product();


    @Override
    public void buildPart1() {
        product.setPart1("part1 build");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2 build");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

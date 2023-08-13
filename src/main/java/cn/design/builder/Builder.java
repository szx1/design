package cn.design.builder;

/**
 * @author zengxi.song
 * @date 2022/10/17
 */
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product getProduct();
}

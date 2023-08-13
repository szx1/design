package cn.design.builder;


/**
 * @author zengxi.song
 * @date 2022/10/18
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        // 组合复杂构建逻辑
        builder.buildPart1();
        builder.buildPart2();
    }
}

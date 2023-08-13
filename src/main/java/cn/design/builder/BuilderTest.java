package cn.design.builder;

import cn.design.entity.User;

/**
 * @author zengxi.song
 * @date 2022/10/18
 */
public class BuilderTest {

    public static void main(String[] args) {
        User user = User.builder().name("张三").age(234).note("haha").build();
        System.out.println(user.getName());

        Builder builder = new ConcreteBuilder();
         new Director(builder).construct();
//        Director director = new Director(builder);
//        director.construct();
        Product product = builder.getProduct();
        System.out.println(product);
    }
}

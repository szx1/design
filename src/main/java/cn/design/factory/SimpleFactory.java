package cn.design.factory;

/**
 * @author zengxi.song
 * @date 2022/10/19
 */
public class SimpleFactory {

    public static AbstractProduct createProduct(String type) {
        if ("one".equals(type)) {
            ProductOne productOne = new ProductOne();
            productOne.setName("oneProduct");
            return productOne;
        } else if ("two".equals(type)) {
            ProductTwo productTwo = new ProductTwo();
            productTwo.setName("twoProduct");
            return productTwo;
        }
        return null;
    }

    public static class ProductOne extends AbstractProduct {
    }

    public static class ProductTwo extends AbstractProduct {
    }

    public static void main(String[] args) {
        System.out.println(SimpleFactory.createProduct("two").getName());
    }
}

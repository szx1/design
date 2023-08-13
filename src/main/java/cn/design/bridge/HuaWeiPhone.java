package cn.design.bridge;

/**
 * @author zengxi.song
 * @date 2022/12/22
 */
public class HuaWeiPhone extends Phone {
    @Override
    protected void state() {
        System.out.println("华为手机");
        software.run();
    }
}

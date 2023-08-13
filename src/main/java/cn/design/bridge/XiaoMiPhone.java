package cn.design.bridge;


/**
 * @author zengxi.song
 * @date 2022/12/22
 */
public class XiaoMiPhone extends Phone {
    @Override
    protected void state() {
        System.out.println("小米手机");
        software.run();
    }

}

package cn.design.bridge;

/**
 * @author zengxi.song
 * @date 2022/12/21
 */
public class BridgeTest {

    public static void main(String[] args) {
        Phone xiaomi = new XiaoMiPhone();
        Software music = new Music();
        xiaomi.setSoftware(music);
        xiaomi.state();

        Phone huawei = new HuaWeiPhone();
        Software game = new Game();
        huawei.setSoftware(game);
        huawei.state();
    }
}

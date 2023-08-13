package cn.design.bridge;

/**
 * @author zengxi.song
 * @date 2022/12/22
 */
public class Game extends Software {
    @Override
    protected void run() {
        System.out.println("运行游戏，ping~ping~~pang~pang");
    }
}

package cn.design.bridge;

import lombok.Setter;

/**
 * @author zengxi.song
 * @date 2022/12/22
 */
public abstract class Phone {
    @Setter
    protected Software software;

    abstract protected void state();
}

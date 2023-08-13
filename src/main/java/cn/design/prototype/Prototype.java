package cn.design.prototype;

import cn.design.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * @author zengxi.song
 * @date 2022/10/13
 */
@Setter
@Getter
public class Prototype implements Cloneable, Serializable {

    private User user;

    private Integer flag;

    private String item;


    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public Prototype deepClone() {
        Prototype prototype = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            // 复制一个相同的对象 写入jvm
            oos.writeObject(this);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            prototype = (Prototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public static void main(String[] args) {
        User user = new User("szx", 22, "haha");
        Prototype prototype = new Prototype();
        prototype.setUser(user);
        prototype.setFlag(1);
        prototype.setItem("item");

        Prototype clone = prototype.deepClone();

        System.out.println(prototype);
        System.out.println(clone);
        System.out.println(prototype.getUser());
        System.out.println(clone.getUser());

        System.out.println(prototype.getFlag());
        System.out.println(clone.getFlag());

        System.out.println(prototype.getItem());
        System.out.println(clone.getItem());

        prototype.setFlag(2);
        System.out.println(prototype.getFlag());
        System.out.println(clone.getFlag());

        prototype.setItem("item2");
        System.out.println(prototype.getItem());
        System.out.println(clone.getItem());

        prototype.getUser().setName("yjy");
        System.out.println(prototype.getUser().getName());
        System.out.println(clone.getUser().getName());
    }


}

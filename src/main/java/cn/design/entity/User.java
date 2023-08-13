package cn.design.entity;

import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author zengxi.song
 * @date 2022/10/13
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private String name;

    private Integer age;

    private String note;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.note = builder.note;
    }

    /**
     * 提供静态方法返回具体创建者
     *
     * @return
     */
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {

        private String name;

        private Integer age;

        private String note;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder note(String note) {
            this.note = note;
            return this;
        }

        public User build() {
            if (StringUtils.isBlank(this.name)) {
                throw new RuntimeException("name cannot blank");
            }
            if (this.age == null) {
                throw new RuntimeException("age cannot null");
            }
            return new User(this);
        }
    }
}

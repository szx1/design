package cn.design;

import static org.junit.Assert.assertTrue;

import cn.design.entity.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<User> userClass = User.class;
        User user = userClass.newInstance();
        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(user,"szx");
            }
        }
        System.out.println(user.getName());
    }
}

package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname DemoTest
 * @Description 测试类
 * @Date 2022/1/22 14:02
 * @Created by AN
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:springaop.xml")
public class DemoTest {

    @Autowired
    private UserService userService;


    @Test
    public void run() {
        userService.add();
        userService.delete();
        userService.update();
    }

}

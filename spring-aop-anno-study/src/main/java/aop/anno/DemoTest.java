package aop.anno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname DemoTest
 * @Description TODO
 * @Date 2022/1/22 14:47
 * @Created by AN
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DemoTest {

    @Autowired
    private UserService userService;

    @Test
    public void run() {
        userService.add();
    }

}

package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname Demo
 * @Description Spring IOC测试类
 * @Date 2022/1/21 17:09
 * @Created by AN
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springioc.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
    }
}

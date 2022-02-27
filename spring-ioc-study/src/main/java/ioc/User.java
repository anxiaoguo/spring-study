package ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Classname User
 * @Description TODO
 * @Date 2022/1/21 13:03
 * @Created by AN
 */
@Data
public class User {

    private Integer uid;

    private String uname;

    private String upwd;

    private List<Object> list;

    private Set<Object> set;

    private Map<String, Object> map;

    private Object[] obj;

    private Properties properties;

    @Value("${jdbc.driverclass}")//DI注解
    private String driverClassName;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String url;


}

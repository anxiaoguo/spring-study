package aop.anno;

import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description 目标类
 * @Date 2022/1/22 13:52
 * @Created by AN
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add~~~~~~~~~~~~~~");
    }

    @Override
    public void delete() {
        System.out.println("delete~~~~~~~~~~~");
    }

    @Override
    public void update() {
        System.out.println("update~~~~~~~~~~~~~~");
    }
}

package cn.axg.mvc.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
@Slf4j
public class MyInterceptor1 implements HandlerInterceptor {

    //在到达控制器方法前拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("成功拦截~~~~~~~~111");
        return true;
    }
}

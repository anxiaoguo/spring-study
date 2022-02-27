package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Classname MyAdvice
 * @Description 通知增强类（环绕通知的实现方式）
 * @Date 2022/1/22 13:54
 * @Created by AN
 */
public class MyAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object proceed = null;

        try {
            System.out.println("前置通知-------------");
           proceed = methodInvocation.proceed();
            System.out.println("后置通知-------------");
        } catch (Exception e) {
            System.out.println("异常通知-------------");
            e.printStackTrace();
        } finally {
            System.out.println("最终通知-------------");
            return proceed;
        }
    }
}

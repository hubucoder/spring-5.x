package aop.sample.bean;


import org.springframework.stereotype.Component;

@Component
public class MyBeanImpl implements MyBean {

    public void sayHi() {
        System.out.println("业务方法执行， sayHi");
    }
}
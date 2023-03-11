package aop.sample;

import aop.sample.config.Config;
import aop.sample.service.SmsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SmsService smsService = context.getBean(SmsService.class);
        smsService.sendSms();
    }
}

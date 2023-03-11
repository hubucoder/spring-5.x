package aop.sample.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //开启aop功能
@ComponentScan(basePackages = "aop.sample")
public class Config {

}
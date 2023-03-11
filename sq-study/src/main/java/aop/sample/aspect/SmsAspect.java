package aop.sample.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SmsAspect {

	@Pointcut(value = "execution(public * aop.sample.service..*.*(..))")
	public void pointcut() {
	}

//	@Pointcut(value = "public .* aop.sample.bean.*.*(.*)")
//	public void pointcut2() {}

	@Before(value = "pointcut()")
	public void before() {
		System.out.println("前置通知，before..........");
	}

	@After(value = "pointcut()")
	public void after() {
		System.out.println("后置通知，after..........");
	}

	@Around(value = "pointcut()")
	public Object around(ProceedingJoinPoint myProceedingJoinPoint) {

		System.out.println("环绕通知，around start..........");

		Object object = null;
		try {
			//执行真正的service里面的方法
			object = myProceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

		System.out.println("环绕通知，around end..........");
		return object;
	}
}
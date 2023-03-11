package aop.sample.service.impl;


import aop.sample.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

	public void sendSms() {
		System.out.println("业务方法执行，sendSms: spring aop......");
	}
}
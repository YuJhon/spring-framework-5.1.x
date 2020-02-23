package com.rain.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <pre>功能描述：</br><pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 21:44
 * @version v1.0
 */
@Component
@Aspect
public class RainAop {

	@Pointcut("execution(* com.rain.service..*.*(..))")
	public void interfacePointCut() {
	}

	@Pointcut("execution(* com.rain.dao.IndexDao.query*(..))")
	public void clazzPointCut() {
	}


	@Before(value = "clazzPointCut()")
	public void beforeProcess() {
		System.out.println("aop before");
	}


}

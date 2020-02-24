package com.rain.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <pre>功能描述：</br>AOP定义<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 21:44
 * @version v1.0
 */
@Component
@Aspect
public class RainAop {

	/**
	 * within 控制范围相对 execution 来说没有这么灵活
	 * target
	 * this
	 */
	@Pointcut("within(com.rain.service.IndexService)")
	public void withPointCut() {
	}

	/**
	 * AOP接口方式--JDK动态代理测试
	 */
	@Pointcut("execution(* com.rain.service..*.query*(..))")
	public void interfacePointCut() {
	}

	/**
	 * AOP类方式--Cglib动态代理测试
	 */
	@Pointcut("execution(* com.rain.dao.IndexDao.query*(..))")
	public void clazzPointCut() {
	}


	@Before(value = "clazzPointCut()")
	public void beforeProcess() {
		System.out.println("aop before");
	}


}

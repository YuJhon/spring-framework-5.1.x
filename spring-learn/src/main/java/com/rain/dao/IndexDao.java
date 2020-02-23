package com.rain.dao;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Repository;

/**
 * <pre>功能描述：</br>dao测试<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 13:38
 * @version v1.0
 */
@Repository
public class IndexDao {

	public void queryDataA() {
		System.out.println("IndexDao.queryData");
		/**
		 *
		 * Spring AOP 失效原因分析：
		 *
		 * 在cglib代理类中调用的就是super.queryDataB(); -- 基于继承的方式，代理类继承了目标类
		 * 在JdkDynamicProxy中调用的就是this.queryDataB(); -- 基于接口实现的方式，目标类和代理类实现相同的接口，
		 * 		（因为默认生成的代理对象已经继承了Proxy类，由于java中支持单继承，所以只能通过实现接口的方式来实现）。
		 * 而这个写法在代理类生成的时候就已经初始化好了，所以会出现没有使用代理类去调用queryDataB,
		 *
		 * 而是使用的目标对象去调用的，所以可以通过如下方式来强制使用代理类：
		 * 1. 首先要开启exposeProxy=true
		 * 2. 强制使用代理去调用对应的方法
		 *
		 * **/
		((IndexDao) AopContext.currentProxy()).queryDataB();
	}

	public void queryDataB() {
		System.out.println("IndexDao.queryDataB");
	}
}

package com.rain.bpp;

import com.rain.test.RainTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * <pre>功能描述：</br>自定义后置处理器<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 17:34
 * @version v1.0
 */
@Component
public class RainBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals(RainTest.TEST_BEAN_NAME)) {
			System.out.println("RainBeanPostProcessor.postProcessBeforeInitialization");
		}
		/** 模拟代理对象处理 **/
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),
				bean.getClass().getInterfaces(),
				(proxy, method, args) -> method.invoke(bean, args));
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals(RainTest.TEST_BEAN_NAME)) {
			System.out.println("RainBeanPostProcessor.postProcessAfterInitialization");
		}
		return null;
	}

	@Override
	public int getOrder() {
		/**
		 * 可以指定顺序
		 */
		return 0;
	}
}

package com.rain.service.impl;

import com.rain.service.IndexService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


/**
 * <pre>功能描述：</br>逻辑接口实现<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 13:37
 * @version v1.0
 */
@Service
public class IndexServiceImpl implements IndexService, ApplicationContextAware {

	private ApplicationContext applicationContext;

	public IndexServiceImpl() {
		System.out.println("constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@Override
	public String queryIndex() {
		return "query ";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 这里就是在源码中设置的后置处理器，入口refresh()方法
		//AbstractApplicationContext#prepareBeanFactory
		this.applicationContext = applicationContext;
	}
}

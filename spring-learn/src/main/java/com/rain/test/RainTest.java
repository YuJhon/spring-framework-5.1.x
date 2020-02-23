package com.rain.test;

import com.rain.config.RainConfig;
import com.rain.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <pre>功能描述：</br>基本测试<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 13:39
 * @version v1.0
 */
public class RainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(RainConfig.class);

		IndexService indexService = (IndexService) ac.getBean("indexServiceImpl");

		System.out.println(indexService.queryIndex());
	}
}

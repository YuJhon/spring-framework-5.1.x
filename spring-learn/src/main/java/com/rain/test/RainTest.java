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

	public static final String TEST_BEAN_NAME="indexServiceImpl";

	public static void main(String[] args) {
		/** annotation/xml/@bean **/
		/** 1.初始化spring所有前提准备条件 **/
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(RainConfig.class);

		IndexService indexService = (IndexService) ac.getBean(TEST_BEAN_NAME);

		System.out.println(indexService.queryIndex());


	}
}

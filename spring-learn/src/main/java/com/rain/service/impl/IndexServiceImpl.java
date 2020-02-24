package com.rain.service.impl;

import com.rain.service.IndexService;
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
public class IndexServiceImpl implements IndexService {


	public IndexServiceImpl() {
		System.out.println("constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@Override
	public String queryIndex() {
		System.out.println("IndexServiceImpl#queryIndex");
		/** 添加内部调用 **/
		queryInner();

		return "index ";
	}

	@Override
	public String queryInner() {
		System.out.println("IndexServiceImpl#queryInner");
		return "Inner";
	}
}

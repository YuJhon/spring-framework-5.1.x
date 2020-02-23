package com.rain.service.impl;

import com.rain.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * <pre>功能描述：</br>逻辑接口实现<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 13:37
 * @version v1.0
 */
@Service
public class IndexServiceImpl implements IndexService {

	@Override
	public String queryIndex() {
		return "This Is Query Index Method . ";
	}
}

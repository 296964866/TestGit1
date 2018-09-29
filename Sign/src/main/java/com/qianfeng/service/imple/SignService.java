package com.qianfeng.service.imple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.SignMapper;
import com.qianfeng.entity.Sign;
import com.qianfeng.service.ISignService;



@Service
public class SignService implements ISignService {

	@Autowired
	private SignMapper signMapper;
	
	/**
	 * Sign展示
	 */
	@Override
	public List<Map<String, Object>> signListService(int page, int limit) {
		List<Map<String, Object>> list = null;
		List<Map<String, Object>> list1 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		int countPage = (page - 1) * limit;
		map.put("count", countPage);
		map.put("size", limit);
		
		try {
			list = signMapper.signList(map);
			Iterator<Map<String, Object>> iterator = list.iterator();

			while (iterator.hasNext()) {
				Map<String, Object> map1 = iterator.next();
				list1.add(map1);

			}
			return list1;
		} catch (Exception e) {
			return null;
		}
		
	}

	/**
	 * 总数据
	 */
	@Override
	public int countService() {
		int count = signMapper.count();
		return count;
	}

	@Override
	public void insertSignService(Sign sign) {
		
		
			signMapper.insertSign(sign);
		
		
	}
}

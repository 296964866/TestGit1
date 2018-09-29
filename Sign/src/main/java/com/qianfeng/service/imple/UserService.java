package com.qianfeng.service.imple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.UserMapper;
import com.qianfeng.entity.Authority;
import com.qianfeng.entity.User;
import com.qianfeng.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;
	/**
	 * 用户登录
	 */
	@Override
	public void userLoginService(String no, String password) {
		
		if(null == no) {
			throw new  RuntimeException("账号不能为空");
		}
		if(null == password) {
			throw new  RuntimeException("密码不能为空");
		}
		Map<String,Object> map = new HashMap<>();
		map.put("no", no);
		map.put("password", password);
		int count = 0;
		
		try {
			 count = userMapper.userLogin(map);
			 if(count <= 0) {
				 throw new  RuntimeException("无数据"); 
			 }
			
			
		} catch (Exception e) {
			
		}
	
	}
	@Override
	public void insertUserService(User user) {
		if(null == user) {
			 throw new  RuntimeException("无数据"); 
		}
		try {
			userMapper.insertUser(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	/**
	 * 密码修改
	 */
	@Override
	public void updateUserService(User user) {
	
		if(null == user) {
			 throw new  RuntimeException("无数据"); 
		}
		try {
			userMapper.updateUser(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	@Override
	public List<Map<String, Object>> roleFindByNo(String no) {

		if (null == no) {
			throw new RuntimeException("参数不能为空");
		}

		// 父级标题
		List<Map<String, Object>> list1 = new ArrayList<>();

		try {
			// 总数据
			List<Authority> list = userMapper.roleFindByNo(no);

			int aid = 0;

			for (Authority au : list) {
				Map<String, Object> map = new HashMap<>();

				// 当parentid == 0 添加1级列表
				if (au.getParentid() == 0) {
					map.put("id", au.getId());
					map.put("aicon", au.getAicon());
					map.put("emenu", au.getTitle());
					list1.add(map);
					aid = au.getId();
				}
				List<Map<String, Object>> list2 = new ArrayList<>();
				for (Authority au1 : list) {
					Map<String, Object> map1 = new HashMap<>();
					if (aid == au1.getParentid()) {
						map1.put("id", au1.getId());
						map1.put("title", au1.getTitle());
						map1.put("aurl", au1.getAurl());
						list2.add(map1);
					}
				}
				map.put("bmenu", list2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return list1;

	}
	
	
	
	

}

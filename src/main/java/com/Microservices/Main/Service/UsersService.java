package com.Microservices.Main.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Microservices.Main.VO.UsersVO;

@Component
public class UsersService {
	
	
	public List<UsersVO> getUsers(){
		return new ArrayList<>();
//		return mainDAO.getUsers();
	}
}

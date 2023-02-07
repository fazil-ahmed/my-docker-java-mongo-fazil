package com.Microservices.Main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Microservices.Main.DAO.AbstractMenuDAO;
import com.Microservices.Main.VO.MenuItemsVO;

@Component
public class MenuService {
	
	
	@Autowired
	AbstractMenuDAO abstractMenuDAO;
	
	public void insertAllMenuItems(List<MenuItemsVO> items) {
		abstractMenuDAO.saveAll(items);
	}
	
	public void insertMenuItem(MenuItemsVO items) {
		abstractMenuDAO.save(items);
	}

	public List<MenuItemsVO> getAllItems() {
		return abstractMenuDAO.findAll();
	}

//	public List<MenuItemsVO> getAllItems() {
//		return menuDAO.getAllItems();
//	}
	
}

package com.Microservices.Main.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Microservices.Main.VO.MenuItemsVO;

@Repository
public interface AbstractMenuDAO extends MongoRepository<MenuItemsVO, String>{

}

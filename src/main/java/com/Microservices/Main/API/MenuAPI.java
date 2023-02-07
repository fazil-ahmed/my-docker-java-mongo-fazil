package com.Microservices.Main.API;




import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Main.API.common.HTTPResponseHandler;
import com.Microservices.Main.Service.MenuService;
import com.Microservices.Main.VO.MenuItemsVO;





@RestController
@RequestMapping(CustomRequestMappings.UMMAHS_KITCHEN)
public class MenuAPI extends HTTPResponseHandler {
	
	private final String EMPLOYEE_ENDPOINTS_RUNNING = "Employee CRUD endpoints are running";
	
	final static Logger logger = Logger.getLogger(MenuAPI.class);

	@Autowired
	MenuService menuService;
	
	@GetMapping(CustomRequestMappings.CONTEXT_PATH)
	public String plainRequest() {
		logger.info("Reached API!!!");
		return EMPLOYEE_ENDPOINTS_RUNNING;
	}



	@RequestMapping(value = "/insert-all-items",method = RequestMethod.POST)
	public String hello(@RequestBody final List<MenuItemsVO> items) {
		menuService.insertAllMenuItems(items);
		return "Added sucessfully";
	}
	
//	@PostMapping(value = "/insert-one-items",consumes = {MediaType.APPLICATION_JSON})
//	//	@Consumes(MediaType.APPLICATION_JSON)
//	public String hello(@RequestBody final MenuItemsVO items) {
//		menuService.insertMenuItem(items);
//		return "Added sucessfully";
//	}

	@GetMapping(path = "/get-all-items",produces = "application/json")
	public List<MenuItemsVO> getAllItems(){
		return menuService.getAllItems();
	}
}

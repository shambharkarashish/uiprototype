package com.food.court.stub;

import java.util.ArrayList;
import java.util.List;

import com.food.court.model.MenuItem;
import org.springframework.stereotype.Service;
import service.MenuItemService;

/**
 * Service which provides RESTful methods
 * to the client side backbone calls.
 * 
 * @author Tushar Joshi <tushar_joshi@persistent.co.in>
 *
 */
@Service(value = "menuItemService")
public class MenuItemServiceImpl implements MenuItemService{
	
	public MenuItem getMenuItem(String item) {
		MenuItem menuItem = MenuItemMap.get(item.toLowerCase());
		if( null == menuItem ) {
			menuItem = new MenuItem();
		}
		return menuItem;
 
	}

	public List<MenuItem> list() {
		List<MenuItem> menuItemList = new ArrayList<MenuItem>(MenuItemMap.values());
		return menuItemList;
	}
}

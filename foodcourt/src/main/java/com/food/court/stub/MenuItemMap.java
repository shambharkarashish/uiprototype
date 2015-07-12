package com.food.court.stub;

import com.food.court.model.MenuItem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <code>MenuItemMap</code> reprsents the data store for
 * this example.  This static class provides static methods
 * for adding, removing and listing the model objects.
 * 
 * @author Tushar Joshi <tushar_joshi@persistent.co.in>
 *
 */
public class MenuItemMap {
	
	/**
	 * internal map to hold the model objects
	 */
	private static Map<String, MenuItem> menuItemMap = createItemMap();
	
	/**
	 * This method loads the models, including creating
	 * them.  This method is currently hard coded to load
	 * static model objects.
	 * 
	 * @return Map of the loaded model onjects
	 */
	private static Map<String, MenuItem> createItemMap() {
		Map<String, MenuItem> map = new HashMap<String, MenuItem>();
		
		MenuItem menuItem = new MenuItem();
		
		menuItem.setId("kachori");
		menuItem.setUrl("/json/items/kachori");
		menuItem.setName("Kachori");
		menuItem.setCategory("Snacks");
		menuItem.setImagepath("kachori.jpg");
		map.put(menuItem.getId(), menuItem);
		
		menuItem = new MenuItem();
		
		menuItem.setId("samosa");
		menuItem.setUrl("/json/items/samosa");
		menuItem.setName("Samosa");
		menuItem.setCategory("Snacks");
		menuItem.setImagepath("samosa.jpg");
		map.put(menuItem.getId(), menuItem);
		
		menuItem = new MenuItem();
		
		menuItem.setId("dosa");
		menuItem.setUrl("/json/items/dosa");
		menuItem.setName("Dosa");
		menuItem.setCategory("Snacks");
		menuItem.setImagepath("dosa.jpg");
		map.put(menuItem.getId(), menuItem);
		
		menuItem = new MenuItem();
		
		menuItem.setId("dahiwada");
		menuItem.setUrl("/json/items/dahiwada");
		menuItem.setName("Dahiwada");
		menuItem.setCategory("Snacks");
		menuItem.setImagepath("dahiwada.jpg");
		map.put(menuItem.getId(), menuItem);
		
		
		return map;
	}

	/**
	 * To get a model using a id.
	 * 
	 * @param id unique id of the model
	 * @return matching model object
	 */
	public static MenuItem get(String id) {
		return menuItemMap.get(id);
	}
	
	/**
	 * To store the model into the store.
	 * 
	 * @param id Key by which model is stored
	 * @param menuItem model which is stored
	 */
	public static void put(String id, MenuItem menuItem) {
		menuItemMap.put(id, menuItem);
	}
	
	/**
	 * To remove model from store using a id
	 * 
	 * @param id of the model to be removed
	 */
	public static void remove(String id) {
		menuItemMap.remove(id);
	}
	
	/**
	 * Provides a collection of all the models
	 * currently stored.
	 * 
	 * @return Collection of current model objects
	 */
	public static Collection<MenuItem> values() {
		return menuItemMap.values();
	}
}

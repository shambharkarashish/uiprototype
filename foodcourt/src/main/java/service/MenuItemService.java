package service;

import com.food.court.model.MenuItem;

import java.util.List;

/**
 * Created by root on 5/21/15.
 */
public interface MenuItemService {

    public MenuItem getMenuItem(String item);

    public List<MenuItem> list();
}

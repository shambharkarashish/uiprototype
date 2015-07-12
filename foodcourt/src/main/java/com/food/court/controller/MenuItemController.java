package com.food.court.controller;

import com.food.court.model.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MenuItemService;

import java.util.List;

/**
 * Created by root on 5/21/15.
 */
@Controller
@RequestMapping("/menuitems")
public class MenuItemController {
    @Autowired
    private MenuItemService  menuItemService;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/list",
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public final List<MenuItem> list(){
       return menuItemService.list();
    }

}

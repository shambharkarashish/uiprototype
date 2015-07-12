package com.food.court.controller;

import com.food.court.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 6/4/15.
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    //Map to store employees, ideally we should use database
    Map<Integer, Employee> empData = new HashMap<Integer, Employee>();

    @RequestMapping(value = "/dummy", method = RequestMethod.GET)
    public @ResponseBody Employee getDummyEmployee() {
        logger.info("Start getDummyEmployee");
        Employee emp = new Employee();
        emp.setId(9999);
        emp.setName("Dummy");
        empData.put(9999, emp);
        return emp;
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public @ResponseBody Employee getEmployee(@PathVariable("id") int empId) {
        logger.info("Start getEmployee. ID="+empId);
        return empData.get(empId);
    }
}

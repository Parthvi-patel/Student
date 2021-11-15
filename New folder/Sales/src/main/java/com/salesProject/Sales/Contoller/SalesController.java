package com.salesProject.Sales.Contoller;


import com.salesProject.Sales.DAO.SQLoperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    SQLoperation sqLoperation;
    List<String> sales;
    @GetMapping(path = "/View")
    public List getdata() throws Exception{
        sales =sqLoperation.Select();
        return sales;
    }

    @GetMapping(path = "/Home")
    public String home(){
        return index.html;
    }
    @RequestMapping(value = "/sales",method = RequestMethod.POST)
    public ResponseEntity<Object>getSales(){

        return
    }
}

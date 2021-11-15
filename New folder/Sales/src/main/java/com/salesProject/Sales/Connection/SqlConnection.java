package com.salesProject.Sales.Connection;

import com.salesProject.Sales.QueryConstants.Constant;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.salesProject.Sales.QueryConstants.Constant.*;

public class SqlConnection {

    Connection con;

    public Connection getConnection(){

        try{
            con=DriverManager.getConnection( Constant.url, user, password);
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }

}

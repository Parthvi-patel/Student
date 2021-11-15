package com.salesProject.Sales.DAO;

import com.salesProject.Sales.Connection.SqlConnection;
import com.salesProject.Sales.Model.SalesModel;
import com.salesProject.Sales.Queries.SalesQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class SQLoperation   {
    @Autowired
            SqlConnection sqlConnection;
    @Autowired
            SalesModel salesModel;
    List<SalesModel> salesModels=new ArrayList<>();

    SalesModel[] salesModelsArray =new SalesModel[3];

    Connection con;
    Statement statement;
    PreparedStatement preparedStatement;


    public List Select(){

        int length=0;
        try{
            con= sqlConnection.getConnection();
             statement=con.createStatement();
            ResultSet rs=statement.executeQuery(SalesQueries.Select);

            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
                + rs.getString(3)+" "+rs.getString(4)+" "
                +rs.getInt(5));

                salesModelsArray[length]=new SalesModel(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),
                        rs.getInt(5));
                salesModels.add(salesModelsArray[length]);
                length++;

            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return salesModels;
    }
    public int insert(String salesId,String customersId,String orderDate,String deliverDate,int qunatity){
        int counter=0;
        try {
            con=sqlConnection.getConnection();
            statement=con.createStatement();
            preparedStatement=con.prepareStatement(SalesQueries.Insert);
            preparedStatement.setString(1,salesId);
            preparedStatement.setString(2,customersId);
            preparedStatement.setString(3,orderDate);
            preparedStatement.setString(4,deliverDate);
            preparedStatement.setInt(5,qunatity);

            counter=preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        return counter;
    }

}

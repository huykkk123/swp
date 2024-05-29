/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.ResultSet;
import entity.Product;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HoangPC
 */
public class ProductDAO extends DBContext{

    
    public List<Product> findAll() {
      List<Product> listproduct = new ArrayList<>();
      connection= getConnection();
        String sql = "SELECT *\n"
                + "  FROM [dbo].[Product]";
        try{
           PreparedStatement pre = connection.prepareStatement(sql);
           ResultSet resultSet = pre.executeQuery();
           
           while(resultSet.next()){
               Product pr = new Product();
               int id = resultSet.getInt("product_id");
               
               pr.setProduct_id(id);
               listproduct.add(pr);
           }
           
        }catch(SQLException e){
            
            
        }
        
        return listproduct;
    }

    
    public int insert(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

package Session6;

import Connector.Connector;
import Lab6fix.Products;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDataAccessObject implements DataAccessObjectConcreate<Products> {

    // 1 table
    private static ProductDataAccessObject instance;

    private ProductDataAccessObject(){
    }
    public static ProductDataAccessObject getInstance(){
        if(instance == null)
            instance = new ProductDataAccessObject();
        return  instance;
    }
    @Override
    public ArrayList<Products> list() {
        try{
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM products");
            ArrayList<Products> ls = new ArrayList<>();
            while (rs.next()){
                ls.add(new Products(rs.getInt("id"),rs.getString("name"),
                        rs.getString("description"),rs.getDouble("price"),
                        rs.getInt("amount")));
            }
            return ls;
        }catch (Exception e){
        }

        return null;
    }

    // MVC
    public Products getOne(int id){
        try{
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM products WHERE id = "+id);
            while (rs.next()){
                return new Products(rs.getInt("id"),rs.getString("name"),
                        rs.getString("description"),rs.getDouble("price"),
                        rs.getInt("amount"));
            }
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public Boolean create(Products product) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "INSERT INTO products (name,description,price,amount) VALUES('"+product.getName()+
                    "','"+product.getDescription()+"',"+product.getPrice()+
                    ","+product.getAmount()+")";
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){
        }

        return false;
    }

    @Override
    public Boolean update(Products product) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "UPDATE products SET name = "+product.getName()+
                    " description = "+ product.getDescription()+
                    " price = "+ product.getPrice()+
                    " quantity = "+product.getAmount()+
                    " WHERE id =" +product.getId();
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){
        }

        return false;
    }

    @Override
    public Boolean delete(Products product) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "DELETE FROM products WHERE id="+product.getId();
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){
        }
        return false;
    }
}
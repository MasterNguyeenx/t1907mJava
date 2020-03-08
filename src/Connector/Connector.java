package Connector;

import java.sql.*;

public class Connector {
    private String url = "jdbc:mysql://localhost:3306/t1907m";
    private String username = "root";
    private String password = "";

    private Statement stm;

    private static Connector con;

    private Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            stm = conn.createStatement();
        }catch(Exception e){

        }
    }

    public static Connector getInstance(){
        if(con == null){
            con = new Connector();
        }
        return con;
    }

    public ResultSet getQuery(String sql) throws Exception{
        return stm.executeQuery(sql);
    }
    public Boolean excuteUpdate (String sql) throws Exception{
        if(stm.executeUpdate(sql) > 0){
            return true;
        }
        return false;
    }

}

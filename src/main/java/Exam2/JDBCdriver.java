package Exam2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCdriver{

    private static final String DriverName="com.mysql.jdbc.Driver";
    private static final String Url="jdbc:mysql://cdb-2i06sqln.gz.tencentcdb.com:10098/sakila";
    private static final String User="root";
    private static final String Password="yzj578692102";
    private static Connection conn = null;
    /**
     * 加载驱动
     */
    static{
        try {
            Class.forName(DriverName).newInstance();
        } catch (Exception e) {
            System.out.println("驱动加载失败："+e.getMessage());
        }
    }


    public static Connection getConnection(){
        if(conn==null){
            try {
                conn = DriverManager.getConnection(Url,User,Password);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return conn;
    }


}

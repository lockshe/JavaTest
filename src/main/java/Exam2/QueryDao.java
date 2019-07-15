package Exam2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDao {

    public void getCityIDAndName(int countryid){
        Connection conn = JDBCdriver.getConnection();

        String sql = "select city_id,city from city where country_id = ?";

        try {
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setInt(1,countryid);
            ResultSet resultSet = ptmt.executeQuery();
            System.out.printf("城市id | 城市名 %n");
            while (resultSet.next()){
                System.out.printf("%s | %s |%n",resultSet.getString("city_id"),resultSet.getString("city"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }


    }

    public void getFilmByCustomerID(int customer_id){
        Connection conn = JDBCdriver.getConnection();

        String sql = "select film.film_id,title ,rental_date from rental,inventory,film where film.film_id = inventory.film_id and rental.inventory_id = inventory.inventory_id\n" +
                " and customer_id = ? order by rental_date desc";
        try {
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setInt(1,customer_id);
            ResultSet resultSet = ptmt.executeQuery();
            System.out.printf("电影id | 影片名 | 租借日期（降序） %n");
            while (resultSet.next()) {
                System.out.printf("%s | %s | %s %n", resultSet.getString("film_id"),
                                              resultSet.getString("title"),
                                              resultSet.getString("rental_date"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }


}

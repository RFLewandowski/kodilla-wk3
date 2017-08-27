package gov.newworldorder;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;


public class DBConnectionParametersTester {

    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysqlbookdb?serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.getConnection();//this one works
    }
}

package gov.newworldorder;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

    private SessionFactory sessionFactory;

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.go();
    }

    public void go(){
        Configuration conf = new Configuration();
        conf.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        conf.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
        conf.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/MySQLBookDB");
        conf.setProperty("hibernate.connection.username","root");
        conf.setProperty("hibernate.connection.password","root");
    }

}

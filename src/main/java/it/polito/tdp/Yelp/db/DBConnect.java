package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {
	
	static private HikariDataSource ds=null;
	static private String url = "jdbc:mysql://localhost:3306/yelp?user=root&password=root";

	public static Connection getConnection() {
		
		//controllo che non ci siano data source create (così la creo solo la prima volta che chiamo questo metodo)
		if(ds==null) {
			//crea nuova data source 
			ds= new HikariDataSource();
			ds.setJdbcUrl(url);
			ds.setUsername("root");
			ds.setPassword("root");
		}
		
		try {
			return ds.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		
	}
}

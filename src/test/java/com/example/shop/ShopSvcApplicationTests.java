package com.example.shop;

import oracle.jdbc.driver.OracleConnection;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;

@SpringBootTest
class ShopSvcApplicationTests {

	@Test
	public static Connection getConnection(){
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="yan";
		String password="yan";
		String driver="oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username, password);
			Statement state=con.createStatement();   //容器
			String sql="select * from USERINFO";   //SQL语句
			ResultSet resultSet= state.executeQuery(sql);         //将sql语句上传至数据库执行
			while (resultSet.next()){
				System.out.println(resultSet.getString(1)+"--"+resultSet.getString(2));
			}
			con.close();//关闭通道
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Connection conn= getConnection();
	}
}

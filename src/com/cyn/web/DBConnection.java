package com.cyn.web;			//指定类所在的包

import java.sql.*;						//导入数据库操作的类
import java.util.*;
import java.io.*;

public class DBConnection					
{
    private Connection conn = null;			//连接对象

    public DBConnection() {
    	conn = null;
	}

	public  Connection getConn(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?user=root&password=Cyn332299&useUnicode=true&characterEncoding=UTF-8");
		}catch(Exception e){
			//e.printStackTrace();
			//return "操作数据库出错，请仔细检查" ;
			//System.err.println(e.getMessage());
		}
		return conn;
	}
}
	


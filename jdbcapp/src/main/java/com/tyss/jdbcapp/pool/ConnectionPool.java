package com.tyss.jdbcapp.pool;

import static com.tyss.jdbcapp.pool.ConnectionPoolConstants.POOLSIZE;
import static com.tyss.jdbcapp.pool.ConnectionPoolConstants.PWD;
import static com.tyss.jdbcapp.pool.ConnectionPoolConstants.URL;
import static com.tyss.jdbcapp.pool.ConnectionPoolConstants.USER;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool = new Vector<>();
	private static ConnectionPool cpool = null;
	private int poolSize;
	private String url;
	private String userName;
	private String pwd;

	public static ConnectionPool getConnectionPool() throws SQLException, IOException {
		if (cpool == null) {
			cpool = new ConnectionPool();
		}
		return cpool;
	}

	private ConnectionPool() throws SQLException, IOException {
		loadProperties();
		initializePool();
	}

	public Connection getConnection() {
		return pool.remove(0);
	}

	public void returnConnection(Connection conn) {
		pool.add(conn);
	}

	private void loadProperties() throws IOException {

		poolSize = Integer.parseInt(PropertyUtil.getPropertyDetails().loadProperties(POOLSIZE));
		url = PropertyUtil.getPropertyDetails().loadProperties(URL);
		userName = PropertyUtil.getPropertyDetails().loadProperties(USER);
		pwd = PropertyUtil.getPropertyDetails().loadProperties(PWD);
	}

	private void initializePool() throws SQLException {
		for (int i = 0; i < poolSize; i++) {
			Connection con = DriverManager.getConnection(url, userName, pwd);
			pool.add(con);

		}

	}

}

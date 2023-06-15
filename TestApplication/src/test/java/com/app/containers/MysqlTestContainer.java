package com.app.containers;

import org.testcontainers.containers.MySQLContainer;

public class MysqlTestContainer extends MySQLContainer<MysqlTestContainer>{

	public static final String IMAGE_VERSION = "mysql:latest";
	
	public static final String DATABASE_NAME = "test";
	
	public static MySQLContainer mySQLContainer;
	
	public MysqlTestContainer() {
		// TODO Auto-generated constructor stub
		super(IMAGE_VERSION);
	}
	
	public static MySQLContainer getInstance() {
		if (mySQLContainer == null) {
			mySQLContainer = new MySQLContainer<>().withDatabaseName(DATABASE_NAME);
		}
		return mySQLContainer;
	}
	
	@Override
	public void start() {
		super.start();
		System.setProperty("DB_HOST", mySQLContainer.getHost());
		System.setProperty("DB_URL", mySQLContainer.getJdbcUrl());
		System.setProperty("DB_USERNAME", mySQLContainer.getUsername());
		System.setProperty("DB_PASSWORD", mySQLContainer.getPassword());
	}
	
	@Override
	public void stop() {
		
	}
}

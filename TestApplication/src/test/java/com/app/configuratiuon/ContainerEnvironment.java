package com.app.configuratiuon;

import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.app.containers.MysqlTestContainer;

@Testcontainers
public class ContainerEnvironment {

	@Container
	public static MySQLContainer mySQLContainer = MysqlTestContainer.getInstance();
}

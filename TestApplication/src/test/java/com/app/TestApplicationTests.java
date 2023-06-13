package com.app;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.app.configuratiuon.ContainerEnvironment;
import com.app.entity.User;
import com.app.repository.UserRepository;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestApplicationTests extends ContainerEnvironment{

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void getUserEmptyList() {
		List<User> list = userRepository.findAll();
		assertEquals(0, list.size());
	}

}

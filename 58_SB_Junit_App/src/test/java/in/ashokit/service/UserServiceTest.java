package in.ashokit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.ashokit.dao.UserDao;

@SpringBootTest //This annotation tells Spring Boot to start the full application context for testing.
//It loads all the beans like in a real application, so the test class behaves as if it's running inside the Spring Boot app.
@ExtendWith(value = { MockitoExtension.class })//tells the test to use Mockito’s features, like mock injections.
public class UserServiceTest {

	@MockBean //tells Spring to create a mock object of UserDao and inject it into the application context.
	private UserDao userDao;//This is useful for unit testing the service layer without hitting the database.

	@InjectMocks
	private UserService userService;//This tells Mockito to inject the mock dependencies (like userDao) into this UserService instance.
									//think like "Hey Mockito, create a real object of userService, and inject any mocks (like userDao) that are needed inside it."
	@Test
	public void testGetUsername() {
		when(userDao.findName(101)).thenReturn("Ashok");
		String userName = userService.getUserName(101);
		assertEquals("Ashok", userName);
	}
	
	
	
	
}

package wo1261931780.testspringFeign;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import wo1261931780.testspringFeign.pojo.User;
import wo1261931780.testspringFeign.service.UserService;

import java.util.List;

@SpringBootTest
class TestSpringFeignApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Test
	// void getUsers() {
	// 	WebClient client = WebClient.builder().baseUrl("http://localhost:8000/").build();
	// 	HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
	// 	UserService service = factory.createClient(UserService.class);
	// 	List<User> users = service.getUsers();
	// 	for (User user : users) {
	// 		System.out.println(user);
	// 	}
	// }
}

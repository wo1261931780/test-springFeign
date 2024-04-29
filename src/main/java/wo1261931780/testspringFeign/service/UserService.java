package wo1261931780.testspringFeign.service;

import org.springframework.web.service.annotation.GetExchange;
import wo1261931780.testspringFeign.pojo.User;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:test-springFeign
 * Package:wo1261931780.testspringFeign.service
 *
 * @author liujiajun_junw
 * @Date 2024-04-20-01  星期一
 * @Description
 */
public interface UserService {
	@GetExchange("/users")
	List<User> getUsers();
}

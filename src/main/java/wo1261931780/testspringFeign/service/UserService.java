package wo1261931780.testspringFeign.service;

import org.springframework.web.service.annotation.GetExchange;
import wo1261931780.testspringFeign.pojo.User;

import java.util.List;

/**
 * 用户服务接口
 * 定义用户相关的业务操作
 *
 * @author liujiajun_junw
 * @Date 2024-04-20-01  星期一
 */
public interface UserService {
	@GetExchange("/users")
	List<User> getUsers();
}

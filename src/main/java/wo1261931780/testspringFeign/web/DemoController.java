package wo1261931780.testspringFeign.web;

import org.springframework.web.bind.annotation.GetMapping;
import wo1261931780.testspringFeign.pojo.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 用户控制器
 * 提供用户相关的REST API接口
 *
 * @author liujiajun_junw
 * @Date 2024-04-19-58  星期一
 */
public class DemoController {
	@GetMapping("/users")
	public List<User> list() {
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i -> new User("User" + i, i))
				.collect(Collectors.toList());
	}

}

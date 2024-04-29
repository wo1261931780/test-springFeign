package wo1261931780.testspringFeign.pojo;

/**
 * Created by Intellij IDEA.
 * Project:test-springFeign
 * Package:wo1261931780.testspringFeign.pojo
 *
 * @author liujiajun_junw
 * @Date 2024-04-19-56  星期一
 * @Description
 */
public class User {
	private int id;
	private String name;

	public User() {
	}

	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 省略构造方法、Getter和Setter
	@Override
	public String toString() {
		return id + ":" + name;
	}
}

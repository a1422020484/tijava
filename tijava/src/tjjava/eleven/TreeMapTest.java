package tjjava.eleven;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Administrator
 *
 */
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<String,String> tm1 = new TreeMap<>();
		TreeMap<String,String> tm2 = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		TreeMap<User,String> tm3 = new TreeMap<>(new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
				return o1.getId() - o2.getId();
			}
		});
		initMap(tm1);
		initMap(tm2);
		initUserMap(tm3);
		System.out.println(tm1);
		System.out.println(tm2);
		System.out.println(tm3);
	}
	
	public static void initMap(Map<String, String> map){
		map.put("a", "b");
		map.put("ac", "b");
		map.put("ab", "b");
		map.put("a1", "b");
	}
	
	public static void initUserMap(Map<User, String> map){
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		user1.setId(1);
		user1.setName("yang1");
		user2.setId(2);
		user2.setName("yang2");
		user3.setId(3);
		user3.setName("yang3");
		map.put(user1, user1.getName());
		map.put(user2, user2.getName());
		map.put(user3, user3.getName());
	}
}

class User{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


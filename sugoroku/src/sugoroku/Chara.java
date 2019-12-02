package sugoroku;
/**
 * 参加者ｸﾗｽ
 * @author 3d165
 *
 */
public class Chara {
	String name;
	int pos;
	int mon;
	boolean key;
	
	public Chara(String name) {
		this.name = name;
		this.pos = 0;
		this.mon = 0;
		this.key = false;
	}
	/**
	 * @return
	 */
	public int getPosition() {
		return this.pos;
	}
	
	public void proceed(int amount) {
		this.pos += amount;
	}
}

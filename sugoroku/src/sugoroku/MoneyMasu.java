package sugoroku;

public class MoneyMasu extends masu {
	
	String s;
	
	int m;
	
	public MoneyMasu(String s,int m) {
		this.s = s;
		this.m = m;
	}

	@Override
	public void event() {
	}

	@Override
	public String getMark() {
		
		return "$";
	}

	@Override
	public String getFlavor() {
		
		return s;
	}

	@Override
	public int getMove() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	@Override
	public int money() {
		return m;
	}

}

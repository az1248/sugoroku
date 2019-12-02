package sugoroku;
/**
 * スタートマス
 * @author 3d165
 *
 */
public class FuridaMasu extends masu {

	public FuridaMasu() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void event() {
		
	}

	@Override
	public String getMark() {
		// TODO 自動生成されたメソッド・スタブ
		return "@";
	}

	@Override
	public String getFlavor() {
		// TODO 自動生成されたメソッド・スタブ
		return "スタート";
	}

	@Override
	public int getMove() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	@Override
	public int money() {
		return 0;
	}

}

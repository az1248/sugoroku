package sugoroku;
/**
 * 振り出しに戻るマス
 * @author 3d165
 *
 */
public class FuriMasu extends masu {

	public FuriMasu() {
	}
	@Override
	public void event() {
	}

	@Override
	public String getMark() {
		return "'";
	}
	@Override
	public String getFlavor() {
		
		return "振り出しへ..";
	}
	@Override
	public int getMove() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	@Override
	public int money() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}

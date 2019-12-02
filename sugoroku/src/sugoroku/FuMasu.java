package sugoroku;
/**
 * 普通のマス
 * @author 3d165
 *
 */
public class FuMasu extends masu {

	public FuMasu() {
		
	}

	@Override
	public void event() {
		

	}

	@Override
	public String getMark() {
		return "~";
	}

	@Override
	public String getFlavor() {
		return "...";
	}

	@Override
	public int getMove() {
		
		return 0;
	}
	public int money() {
		return 0;
	}

}

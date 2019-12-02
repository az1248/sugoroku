package sugoroku;
/**
 * pﾏｽ移動するﾏｽ
 * @author 3d165
 *
 */
public class MoveMasu extends masu {
	int move;
	public MoveMasu(int p) {
		this.move = p;
	}

	@Override
	public void event() {
		
	}

	@Override
	public String getMark() {
		return "!";
	}

	@Override
	public String getFlavor() {
		return move + "マス進む";
	}

	@Override
	public int getMove() {
		
		return move;
	}
	
	@Override
	public int money() {
		return 0;
	}

}

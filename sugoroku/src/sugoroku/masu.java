package sugoroku;
/**
 * ﾏｽのabstract
 * @author 3d165
 *
 */
public abstract class masu {
	private int pos;
	private int move;
	private String flavor;
	
	
	public masu() {	
	}
	
	public abstract void event();
	
	public abstract String getMark();
	
	public abstract String getFlavor();
	
	public abstract int getMove();
	
	public abstract int money();
	
}

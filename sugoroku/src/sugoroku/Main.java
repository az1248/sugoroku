package sugoroku;

import java.util.Random;
import java.util.Scanner;

/**
 * すごろくメイン
 * @author 3d165
 *
 */
public class Main {
	
	private Random rand = new Random();
	
	private Scanner input = new Scanner(System.in);
	
	private masu[] path;
	
	private Chara p;
	
	int count = 0;
	
	public static void main(String[] args) {
		
	//	Main m = new Main();
	//	m.run();
		new Main().run();
	}

	private void run() {
		initGame();
		boolean goal = true;
		do {
			count++;
			goal = saikoro();
		}while(!goal);
		exitgame();
		
	}

	private boolean saikoro() {
		
		System.out.println("ﾀﾞｲｽを振れ");
		String s = input.nextLine();
		if(s == "cheat") {
			p.mon = 3000;
			p.pos = path.length - 1; 
		}else {
			int proceed = rand.nextInt(4) + 1;
			System.out.println(proceed + " だ");
			if(p.pos + proceed < path.length) {
				p.pos += proceed;
			}else {
				System.out.println("跳ね返す");
				p.pos = (path.length - 1) - ((p.pos + proceed) - (path.length - 1));
			}
		}
		
		showPath(p);
		System.out.println("所持金" + p.mon + "$");
		
		
		boolean goal = path.length - 1 == p.pos;
		if(goal) {
			if(p.mon > 2300) {
				System.out.println(p.name + " 入れ");
			}else {
				System.out.println("金が足りない");
				System.out.println("やり直し");
				p.pos = 0;
				goal = false;
			}
		}
		return goal;
	}

	private void initGame() {
		//マス作成
		path = new masu[20];
		for(int i = 1; i < path.length; i++) {
			path[i] = new FuMasu();
		}
		path[0] = new FuridaMasu();
		path[1] = new MoneyMasu("祝い",1000);
		path[2] = new MoneyMasu("祝い",1000);
		path[4] = new MoveMasu(3);
		path[5] = new MoneyMasu("呪い",-1500);
		path[6] = new FuriMasu();
		path[9] = new MoneyMasu("手当",3500);
		path[13] = new MoneyMasu("13",-1000);
		path[15] = new MoneyMasu("💛",1500);
		path[16] = new MoveMasu(-2);
		path[17] = new MoneyMasu("強盗",-1500);
		path[18] = new MoneyMasu("施し",1500);
		path[path.length - 1] = new GoalMasu();
		
		System.out.println("名前は？");
		p = new Chara(input.nextLine());
		System.out.println("2300$以上持ってこい");
		showPath(p);
	}

	private void showPath(Chara o) {
		for(int i = 0; i < path.length; i++) {
				System.out.print(path[i].getMark() + " ");	
		}
		System.out.println();
		for(int i = 0; i < path.length; i++) {
			if(i != o.getPosition()) {
				System.out.print("  ");
			}else {
				System.out.print("&");
			}
		}
		
		System.out.println();
		System.out.println(path[p.getPosition()].getFlavor());
		if(path[p.pos] instanceof MoveMasu) {
			p.pos += path[p.pos].getMove();
			showPath(p);
		}
		
		if(path[p.pos] instanceof FuriMasu) {
			p.pos = 0;
			System.out.println("oh...");
			showPath(p);
		}
		
		if(path[p.pos] instanceof MoneyMasu) {
			p.mon += path[p.getPosition()].money(); 
			System.out.println(path[p.getPosition()].money() + "$");
		}
		
	}
	private void exitgame() {
		/*
		String w = judgeWinner();
		System.out.println(p.name + "は" + p.mon + "円持っている");
		if(p.mon > 1000) {
			System.out.println("すごい");
		}else {
			System.out.println("不幸");
		}
		*/
		if(count < 10) {
			System.out.println("早い");
		}else {
			System.out.println("遅い");
		}
		System.out.println("終わり");
	}

	private String judgeWinner() {
		
		return null;
	}

}

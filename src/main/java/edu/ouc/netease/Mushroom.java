package edu.ouc.netease;

import java.util.Scanner;

/**
 * 在N*M的草地上,提莫种了K个蘑菇,蘑菇爆炸的威力极大,兰博不想贸然去闯,
 * 而且蘑菇是隐形的.只 有一种叫做扫描透镜的物品可以扫描出隐形的蘑菇,
 * 于是他回了一趟战争学院,买了2个扫描透镜,一个 扫描透镜可以扫描出(3*3)方格中所有的蘑菇,
 * 然后兰博就可以清理掉一些隐形的蘑菇. 问:兰博最多可以清理多少个蘑菇?

输入描述:

第一行三个整数:N,M,K,(1≤N,M≤20,K≤100),N,M代表了草地的大小;
接下来K行,每行两个整数x,y(1≤x≤N,1≤y≤M).代表(x,y)处提莫种了一个蘑菇.
一个方格可以种无穷个蘑菇.

输出描述:

输出一行,在这一行输出一个整数,代表兰博最多可以清理多少个蘑菇.

 * @author wqx
 *
 */
public class Mushroom {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int K = in.nextInt();
		int[][] map = new int[N+1][M+1];
		for(int i = 0; i < K;i++){
			int x = in.nextInt();
			int y = in.nextInt();
			map[x][y]++;
		}
		int mushroomV = 0;
		if(N <= 3 && M <= 3){
			for(int i = 1; i <= N ;i++){
				for(int j = 1; j <= M;j++){
					mushroomV += map[i][j];
				}
			}
			System.out.println(mushroomV);
		}else if(N > 3 && M < 3){
			
		}
		
		int power = in.nextInt();
	}
}

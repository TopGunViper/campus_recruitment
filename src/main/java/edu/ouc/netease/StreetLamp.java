package edu.ouc.netease;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 一条长l的笔直的街道上有n个路灯，若这条街的起点为0，终点为l，第i个路灯坐标为ai，
 * 每盏灯可以覆盖到的最远距离为d，为了照明需求，所有灯的灯光必须覆盖整条街，
 * 但是为了省电，要是这个d最小，请找到这个最小的d。

输入描述:

每组数据第一行两个整数n和l（n大于0小于等于1000，l小于等于1000000000大于0）。
第二行有n个整数(均大于等于0小于等于l)，为每盏灯的坐标，多个路灯可以在同一点。

输出描述:

输出答案，保留两位小数。


输入例子:

7 15
15 5 3 7 9 14 0


输出例子:

2.5

 * @author wqx
 *
 */
public class StreetLamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int n = s.nextInt();
			int l = s.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = s.nextInt();
			}
			Arrays.sort(arr);
			long maxGap = Math.max(arr[0],l-arr[n-1])*2;
			for(int i = 0; i < n-1; i++){
				if(arr[i+1]-arr[i] > maxGap){
					maxGap = arr[i+1]-arr[i];
				}
			}
			DecimalFormat b = new DecimalFormat("#.00");
			String result = b.format(maxGap/2.0);
			System.out.println(result);
		}
		s.close();
	}
}

package edu.ouc.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
题目描述
开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理:
1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；
(文件所在的目录不同，文件名和行号相同也要合并)
2.超过16个字符的文件名称，只记录文件的最后有效16个字符；
(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
3.输入的文件可能带路径，记录文件名称不能带路径

输入描述:

一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。

    文件路径为windows格式

    如：E:\V1R2\product\fpgadrive.c 1325



输出描述:

将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1 

    结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。

    如果超过8条记录，则只输出前8条记录.

    如果文件名的长度超过16个字符，则只输出后16个字符


输入例子:

E:\V1R2\product\fpgadrive.c 1325


输出例子:

fpgadrive.c 1325 1


 */
public class ErrorRecord {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		List<String> names = new ArrayList<String>();
		List<Integer> lines = new ArrayList<Integer>();
		List<Integer> times = new ArrayList<Integer>();
		
		while(sc.hasNext()){
			String path = sc.next();
			int line = sc.nextInt();
			String fileName = getFileName(path);
			handle(names,lines,times,fileName,line);
		}
		for(int i = 0; i < names.size(); i++){
			for(int j = i+1; j < names.size(); j++){
				if(times.get(i) < times.get(j)){
					swap(names,i,j);
					swap(lines,i,j);
					swap(times,i,j);
				}
			}
		}
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i) + "," + lines.get(i) + "," + times.get(i));
		}
	}
	public static void swap(List list,int a,int b){
		Object tmp = list.get(a);
		list.set(a,list.get(b));
		list.set(b, tmp);
	}
	public static void handle(List<String>names,List<Integer>lines,List<Integer>times,String fileName,int line){
		int index = -1;
		for(int i = 0; i < names.size(); i++){
			if(names.get(i).equals(fileName)){
				index = i;break;
			}
		}
		if(index >= 0 && lines.get(index) == line){
			times.set(index,times.get(index)+1);
		}else{
			names.add(fileName);
			lines.add(line);
			times.add(1);
		}
	}
	public static String getFileName(String path){
		if(path.lastIndexOf("\\") != -1){
			return path.substring(path.lastIndexOf("\\")+1);
		}else{
			return path;
		}
	}
}

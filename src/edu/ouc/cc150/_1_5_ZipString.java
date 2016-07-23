package edu.ouc.cc150;

/**
 * 题目描述

利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。

给定一个string iniString为待压缩的串(长度小于等于3000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
测试样例

"aabcccccaaa"

返回："a2b1c5a3"

"welcometonowcoderrrrr"

返回："welcometonowcoderrrrr"
 * @author wqx
 *
 */
public class _1_5_ZipString {

	/**
	 * 注意数组越界及边界值得处理！
	 * 
	 * 运行时间：51ms
	 * 占用内存：809k
	 * 
	 * @param iniString
	 * @return
	 */
	public static String zipString(String iniString) {
		StringBuilder sb = new StringBuilder("");
		int len = iniString.length();
		for(int i = 0,j = 0; i < len; ){
			sb.append(iniString.charAt(i));
			j = i+1;
			while(j < len && iniString.charAt(j) == iniString.charAt(i)){ j++;}
			sb.append(j-i);
			i = j;
		}
		if(sb.length() >= len){
			return iniString;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "jjjjjjxxxxxxxooZLLLLLLLLQQQQQQQQQLLLLLLLLECXXXXXXXIIIIIIIIIhjjyyySSooooooooommmuuEEEEEEEEEnnnnnnnffffffAAAAAllllllllbbbbkkkkkkkkkkkkKKKKKKhhhhhhhhhooooooooooYCCCCCCOOOOOOOOOMMMMMMMMMMiiiiiivvvvvvvWWWWkkkkkkwwwwwwwMmmmmmmmmLLLwwwwwwwkkkjjjjjjttttQQQQQQQQQaaaaaaaFFFFFFFlllllllllggggggggggPPPPPPuuuuuuuuaYYYYYYwQQQFFFFFFFFFFaaaaapXXXXXXXxxxxxxQQQQQQQQQsssssGGGGfffffffddddddpppQQQQQQHHHTTTaaaaaaGGGGGGddyyyyyMhhllllllllllNNNNNNNNUUUWWWWWWLLLLLLLLLYYYYYYYYYYTTKKKKKKKKiiiiiiitttttttXXXXXXXXXLLLHZZZZZZZssssjjJJJEEEEEOOOOOttttttttttBBttttttTTTTTTTTTTrrrrttttRRRRRyyooooooaaaaaaaaarrrrrrrPPPPPPPjjPPPPddddddddddHHHHnnnnnnnnnnSSSSSSSSSSzzHHHHHHHHHddddddDDDzzzhhhhhfffffffffftttttteeeeeeeeEEEEEEEEEaaaaaaccccccccccFFFFFFFF";
		System.out.println("res:" + zipString(str));
	}

}

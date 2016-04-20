package edu.ouc.alibaba;

import java.util.Scanner;
/**
 * 

问题1：尝试用java编写一个转账接口，传入转出账号，转入账号，转账金额3个数据，完成转出和转入账号的资金处理，
该服务要确保在资金处理时转出账户的余额不会透支，金额计算准确，能够支撑每天10万笔的个人用户之间转账。

问题2：假设接口构建完成后，淘宝的担保交易也准备使用该接口，每次用户购买淘宝的商品，都会调用转账接口，
将资金由买家账户转到一个担保交易的中间账户，等到买家收到货并满意后进行确认收货，再调用转账接口从这个
担保交易中间账户转账资金到卖家账户，通过这样的手段保证买家的权益，做到只有买家对货满意才给卖家钱。
此时面对淘宝担保交易的海量交易处理，原来面向个人用户间转账的转账接口可能会遇到怎样的问题？你有怎样的解决方案？
并尝试在不侵入原接口主处理流程的前提下修改代码，优雅的支持淘宝担保交易记账模式。

 * @author wqx
 *
 */
public class AlibabaDemo3 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String str1,str2;
		while(in.hasNext()){
			str1 = in.next();
			str2 = in.next();
		}
	}
}

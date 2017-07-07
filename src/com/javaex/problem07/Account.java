package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;

	//생성자 작성
    public Account(String accountNo) {
    	accountNo = accountNo;
    	System.out.println(accountNo+" 계좌가 개설되었습니다.");
    }
    
    //필요한 메소드 작성
    public int deposit(int des) {
    	balance+=des;
    	return balance;
    }

    public int withdraw(int wid) {
    	balance-=wid;
    	return balance;
    }
    public void showBalance() {
    	System.out.println(balance);
    }

}

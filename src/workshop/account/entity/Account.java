package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

public class Account extends Object {
	private String custId;
	private String acctId;
	private int balance;
	
	//Default Constructor (기본 생성자) < 아무런 생성자 정의가 없으면 컴파일러가 자동으로 생성 
	public Account() {
		System.out.println("Default Construcor Called..");
	}
	
	//Constructor Overloading(생성자 중복정의) 
	public Account(String custId, String acctId, int balance) {
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}

	//setter
	public void setCustId(String custId){
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	//getter
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	public int getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	//출금
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {
			//InsufficientBalanceException 강제로 발생
			String errMessage = String.format("잔액이 부족합니다. (요청 금액: %d, 현재 잔액: %d)", amount, balance);
			throw new InsufficientBalanceException(errMessage);
		}
		this.balance -= amount;
	}
	//부모 클래스가 가진 Object의 toString() 메서드를 재정의(Overriding)
	//Method Signature public String toString()
	@Override
	public String toString() {
		return "Account [custId=" + custId + ", acctId=" + acctId + ", balance=" + balance + "]";
	}
	
}

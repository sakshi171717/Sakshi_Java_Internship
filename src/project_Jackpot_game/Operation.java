package project_Jackpot_game;

import java.util.ArrayList;
import java.util.Random;

public class Operation {
	
	
	public Operation() {
	}
	
	private String username;
	private String password;
	private int points;
	private int usernum;
	
	public Operation(String username, String password, int points) {
		super();
		this.username=username;
		this.password=password;
		this.points=points;
	}
	
	public void setUserName(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public void setPoints(int points) {
		this.points=points;
	}
	
	public void setUserNum(int usernum) {
		this.usernum=usernum;
	}
	
	
	public String getUserName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getUserNum() {
		return usernum;
	}
	
	public int minusPoints() {
		this.points=points-150;
		return points;
	}
	
	public int newPoints(int usernum) {
		int flag=0;
		Random rm=new Random();
		int index=rm.nextInt(1,10);
		System.out.println(index);
		if(usernum==index) {
			this.points=points+300;
			flag=1;
		}
		return flag;
	}
	

}

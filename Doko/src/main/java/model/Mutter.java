package model;

import java.io.Serializable;

public class Mutter implements Serializable{
	private int id;
	private String userName;
	private String text;
	public Mutter() {}
	public Mutter(String userName,String text) {
		this.userName = userName;
		this.text = text;
	}
	public Mutter(int id,String userName,String text) {
		this.userName = userName;
		this.text = text;
		this.id = id;
	}
	public int detId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}

}

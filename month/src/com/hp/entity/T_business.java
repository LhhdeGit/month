package com.hp.entity;

public class T_business {
private Integer bId ;
private Integer bNum;
private String bType;
private String bMark;
public Integer getbId() {
	return bId;
}
public void setbId(Integer bId) {
	this.bId = bId;
}
public Integer getbNum() {
	return bNum;
}
public void setbNum(Integer bNum) {
	this.bNum = bNum;
}
public String getbType() {
	return bType;
}
public void setbType(String bType) {
	this.bType = bType;
}
public String getbMark() {
	return bMark;
}
public void setbMark(String bMark) {
	this.bMark = bMark;
}
public T_business(Integer bId, Integer bNum, String bType, String bMark) {
	super();
	this.bId = bId;
	this.bNum = bNum;
	this.bType = bType;
	this.bMark = bMark;
}
public T_business() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "T_business [bId=" + bId + ", bNum=" + bNum + ", bType=" + bType
			+ ", bMark=" + bMark + "]";
}

}

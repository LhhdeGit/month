package com.hp.entity;

public class T_detail {
private Integer bdId;
private Integer bId;
private String bdName;
private String bdPerson;
public Integer getBdId() {
	return bdId;
}
public void setBdId(Integer bdId) {
	this.bdId = bdId;
}
public Integer getbId() {
	return bId;
}
public void setbId(Integer bId) {
	this.bId = bId;
}
public String getBdName() {
	return bdName;
}
public void setBdName(String bdName) {
	this.bdName = bdName;
}
public String getBdPerson() {
	return bdPerson;
}
public void setBdPerson(String bdPerson) {
	this.bdPerson = bdPerson;
}
public T_detail() {
	super();
	// TODO Auto-generated constructor stub
}
public T_detail(Integer bdId, Integer bId, String bdName, String bdPerson) {
	super();
	this.bdId = bdId;
	this.bId = bId;
	this.bdName = bdName;
	this.bdPerson = bdPerson;
}
@Override
public String toString() {
	return "t_detail [bdId=" + bdId + ", bId=" + bId + ", bdName=" + bdName
			+ ", bdPerson=" + bdPerson + "]";
}


}

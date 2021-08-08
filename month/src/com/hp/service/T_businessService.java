package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.T_business;



public interface T_businessService {
	//Ìí¼Ó
	int add(T_business t_business);
	//È«²é
	ArrayList<T_business> selectall();
	//É¾³ý
	int deletes(int bId);
}

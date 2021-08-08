package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.T_business;

public interface T_businessDao {
	 //Ôö¼Ó   
		int insert(T_business t_business);
		//²éÑ¯
		ArrayList<T_business> selectall();
		//É¾³ı
		int delete(int bId);
}

package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.T_business;



public interface T_businessService {
	//���
	int add(T_business t_business);
	//ȫ��
	ArrayList<T_business> selectall();
	//ɾ��
	int deletes(int bId);
}

package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




import com.hp.entity.T_business;
import com.hp.service.T_businessService;

@Controller
@RequestMapping("/t_business")
public class T_businessController {
	@Autowired
	private T_businessService t_businessService; 
	@RequestMapping("/add")
	public String add(T_business t_business){
		int i=t_businessService.add(t_business);
		if(i>0){
			System.out.println("��ӳɹ�");
			return "redirect:/t_business/query";
		}else{

			System.out.println("���ʧ��");
			return "index";
		}
	}
	@RequestMapping("/query")
	//ȫ��
	public String selectAll(HttpSession session){
		ArrayList<T_business> tbu = t_businessService.selectall();
		//����ѯ�������ݴ��뵽��������
		session.setAttribute("tbu",tbu);
		return "query";
	}
	@RequestMapping("/delete")
	public String delete (Integer bId,HttpSession session){

		int i=t_businessService.deletes(bId);
		if(i>0){
			System.out.println("ɾ���ɹ�");
			return "redirect:/t_business/query";
		}else{

			System.out.println("ɾ��ʧ��");
			return "index";
		}
	}

}

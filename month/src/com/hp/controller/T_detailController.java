package com.hp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.T_detail;
import com.hp.service.T_detailService;

@Controller
@RequestMapping("/tde")
public class T_detailController {
	@Autowired
	private T_detailService t_detailService;
	@RequestMapping("/add2")
	public String addAll2(T_detail t_detail,HttpSession session){
		int i=t_detailService.add(t_detail);
		if(i>0){
			System.out.println("��ӳɹ�");
			session.setAttribute("t_detail", t_detail);
			return "redirect:/tde/queryAll";
		}else{

			System.out.println("���ʧ��");
			return "index";
		}
	}
}
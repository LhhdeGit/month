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
			System.out.println("添加成功");
			return "redirect:/t_business/query";
		}else{

			System.out.println("添加失败");
			return "index";
		}
	}
	@RequestMapping("/query")
	//全查
	public String selectAll(HttpSession session){
		ArrayList<T_business> tbu = t_businessService.selectall();
		//将查询到的数据存入到作用域中
		session.setAttribute("tbu",tbu);
		return "query";
	}
	@RequestMapping("/delete")
	public String delete (Integer bId,HttpSession session){

		int i=t_businessService.deletes(bId);
		if(i>0){
			System.out.println("删除成功");
			return "redirect:/t_business/query";
		}else{

			System.out.println("删除失败");
			return "index";
		}
	}

}

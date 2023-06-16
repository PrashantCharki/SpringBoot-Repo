package com.springmvc.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.boot.model.employee_table;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class HomeController 
{   @Autowired
	EmpRepo repo;
	// modelAttrubute at method level
	@ModelAttribute
	public void ModelData(org.springframework.ui.Model m)
	{
		m.addAttribute("Name","Alien");
	}
	@RequestMapping("/")
	public String home()
	{
		return "index";
		
	}
	
	@GetMapping("getAliens")
	public String getAlien(org.springframework.ui.Model m)
	{
		
		m.addAttribute("result",repo.findAll());
		return "result";
		
	}
	
/*	@RequestMapping("add")
 // public String add(HttpServletRequest req)
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpSession session)
	
	{
	//	int i =Integer.parseInt(req.getParameter("num1"));
	//	int j =Integer.parseInt(req.getParameter("num2"));
		int num3=i+j;
	//	HttpSession session=req.getSession();
		session.setAttribute("num3", num3); 
		return "result.jsp";
		
	}  */
	
	// without Httpsession
	/*@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j)
	{ ModelAndView mv=new ModelAndView();
	 mv.setViewName("result");
	 
	 int num3=i+j;
	// session.setAttribute("num3", num3);
	mv.addObject("num3", num3);
		return mv;
		
	}*/
	
	//model and modelmap
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,org.springframework.ui.Model m)
	{ 
		//ModelAndView mv=new ModelAndView();
	// mv.setViewName("result");
	 
	 int num3=i+j;
	m.addAttribute("num3",num3);
		return "result";
		
	}
	
	/*@RequestMapping("getAliens")
	public String getAliens(org.springframework.ui.Model m)
	{
		List<Alien> aliens= Arrays.asList(new Alien(101,"Alex"),new Alien(102,"Max"));
		m.addAttribute("result",aliens);
		return "ShowResults";
		
	}*/
	@GetMapping(value="getAlien")
	public String getAlien(@ModelAttribute("a1") employee_table a)
	{List<employee_table> aliens= Arrays.asList(new employee_table(101,"Alex"),new employee_table(102,"Max"));
	
	return "ShowResults";
		
		
	}
	
	//@RequestMapping("addAlien")// it will support both get and post
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute("a1") employee_table a)
	{
		return "result";
		
	}
}

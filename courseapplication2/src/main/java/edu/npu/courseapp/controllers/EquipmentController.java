package edu.npu.courseapp.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.Gender;
import edu.npu.courseapp.domain.Student;
import edu.npu.courseapp.domain.User;
import edu.npu.courseapp.services.EquipmentService;
import edu.npu.courseapp.services.StudentService;
import edu.npu.courseapp.services.UserService;

@Controller
public class EquipmentController {
	@Autowired
	StudentService studentService;
	@Autowired
	UserService userservice;
	@Autowired
	EquipmentService eqipmentservice;
	private static final Logger logger = LoggerFactory.getLogger(EquipmentController.class);
	
	@RequestMapping(value = "/newStudentDataForm", method = RequestMethod.GET)
	public ModelAndView newStudentDataForm() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("studentDataForm");
 		modelView.addObject("student", new Student());
		return modelView;
	}
	
	@RequestMapping(value = "/processNewStudentProfile", method = RequestMethod.POST)
	public ModelAndView processNewStudentForm(@Valid Student student, BindingResult result, HttpSession session) 
	{
		ModelAndView modelView;
		
		if (result.hasErrors()) {
			modelView = new ModelAndView("studentDataForm", "student", student);
			return modelView;
		}
		
		studentService.addNewStudent(student);
 		modelView = new ModelAndView("newStudentProfileSuccess");
 		session.setAttribute("student", student);
 		modelView.addObject("student", student);
		
		return modelView;
	}
	
	
	@RequestMapping(value = "/testTransactions", method = RequestMethod.GET)
	public ModelAndView testTransactions() 
	{
		Student goodStudent, badStudent;
		ModelAndView modelView;
		
		goodStudent = new Student();
		goodStudent.setLastName("ValidStudent");
		goodStudent.setFirstName("Joe");
		goodStudent.setGender(Gender.Male);
		goodStudent.setAge(25);
		studentService.addNewStudent(goodStudent);
		
		modelView = new ModelAndView("studentUpdateResult");
		
		try {
			badStudent = new Student();
			studentService.addNewStudent(badStudent);
			modelView.addObject("resultMsg", "The Update was performed.");
		} catch (Exception ex) {  /* Exception from null student name */
			logger.info("Exception occurred as expected in testTransactions: " + ex);
			modelView.addObject("resultMsg", "Unable to perform the Student Update!");
		}
		
		return modelView;
	}
	
	
	@RequestMapping(value = "/eqipment", method = RequestMethod.GET)
	public ModelAndView newEquipmentform() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("equipmentForm");
 		modelView.addObject("equipment", new Equipment());
		return modelView;
	}
	
	@RequestMapping(value = "/processNewEquipmentForm", method = RequestMethod.POST)
	public ModelAndView processNewEquipmentprofile(@Valid Equipment equipment, BindingResult result, HttpSession session) 
	{
		ModelAndView modelView;
		
		if (result.hasErrors()) {
			modelView = new ModelAndView("equipmentForm", "equipment", equipment);
			return modelView;
		}
		
		eqipmentservice.addNewEqu(equipment);
		List<Equipment> EquipmentList;
		EquipmentList = eqipmentservice.getEquList();
 		modelView = new ModelAndView("NewEqipmentAdd");
 		modelView.addObject("EquipmentList", EquipmentList);
		System.out.println("scuessfully");
 		/*modelView = new ModelAndView("NewEqipmentAdd");
 		session.setAttribute("equipment", equipment);
 		modelView.addObject("equipment", equipment);
		*/
		return modelView;
	}
		@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public ModelAndView aboutus() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("aboutus");
 			return modelView;
	}
	@RequestMapping(value = "/photos", method = RequestMethod.GET)
	public ModelAndView images_dis() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("image_slider");
 			return modelView;
	}
	@RequestMapping( value = "/loginform", method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("login");
 		modelView.addObject("user", new User());
 			return modelView;
	}
	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public ModelAndView checkLogin(@Valid User user, BindingResult result, HttpSession session) 
	{
		ModelAndView modelView;
		/*if (result.hasErrors()) {
			modelView = new ModelAndView("login", "user", user);
			System.out.println("Error");
			return modelView;
		}
		*/
		
		//eqipmentservice.addNewEqu(equipment);
		System.out.println(user.getEmailAddress());
		System.out.println(user.getPassword());
		 if(userservice.valid_login1(user.getEmailAddress(),user.getPassword())){
			List<Equipment> EquipmentList;
			EquipmentList = eqipmentservice.getEquList();
	 		modelView = new ModelAndView("equipment_list");
	 		modelView.addObject("EquipmentList", EquipmentList);
			System.out.println("scuessfully");
		
		}else if(userservice.valid_login_user(user.getEmailAddress(),user.getPassword()))
		{
			modelView = new ModelAndView("NewEvents");
			//System.out.println("!try again");
		}else{
			modelView = new ModelAndView("LoginFail");
			System.out.println("!try again");
		}
 		//modelView = new ModelAndView("NewEqipmentAdd");
 		//session.setAttribute("user", user);
 		//modelView.addObject("user", user);
		
		return modelView;
	}
	//instructorList
	
	@RequestMapping(value = "/equipment_list", method = RequestMethod.GET)
	public ModelAndView listofequipment() {
		List<Equipment> EquipmentList;
		ModelAndView modelView;
		EquipmentList = eqipmentservice.getEquList();
		
 		modelView = new ModelAndView("equipment_list");
 		modelView.addObject("EquipmentList", EquipmentList);
 		for(int i=0;i<EquipmentList.size();i++){
 			System.out.println("ee"+EquipmentList.getClass().getName());
 		}
 		//modelView.addObject("EquipmentList", EquipmentList);
 			return modelView;
	}
	@RequestMapping(value = "/equipment_list2", method = RequestMethod.GET)
	public ModelAndView listofequipment2() {
		List<Equipment> EquipmentList;
		ModelAndView modelView;
		EquipmentList = eqipmentservice.getEquList();
		
 		modelView = new ModelAndView("equipment_list_2");
 		modelView.addObject("EquipmentList", EquipmentList);
 		for(int i=0;i<EquipmentList.size();i++){
 			System.out.println("ee"+EquipmentList.getClass().getName());
 		}
 		//modelView.addObject("EquipmentList", EquipmentList);
 			return modelView;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView deleteeq(Equipment equipment) {
		ModelAndView modelView;
		int id  = equipment.getEquipmentID();
		System.out.println("id = "+id);
		eqipmentservice.deleteEqu(id);
		
		List<Equipment> EquipmentList;
		EquipmentList = eqipmentservice.getEquList();
 		modelView = new ModelAndView("equipment_list");
 		modelView.addObject("EquipmentList", EquipmentList);
 			return modelView;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("signup");
 		modelView.addObject("user", new User());
 			return modelView;
	}
	
	@RequestMapping(value = "/signupNew", method = RequestMethod.POST)
	public ModelAndView addNewUserin(@Valid User user, BindingResult result, HttpSession session) 
	{
		ModelAndView modelView;
		if (result.hasErrors()) {
			modelView = new ModelAndView("signup", "user", user);
			return modelView;
		}
		userservice.insertNewuser(user);
 		modelView = new ModelAndView("newUserAddSuccess");
 		session.setAttribute("user", user);
 		modelView.addObject("user", user);
		return modelView;
	}
	
	
	
}

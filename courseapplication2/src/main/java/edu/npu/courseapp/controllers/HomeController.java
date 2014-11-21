package edu.npu.courseapp.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.Instructor;
import edu.npu.courseapp.domain.User;
import edu.npu.courseapp.services.InstructorServices;
import edu.npu.courseapp.services.TimingService;

/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	InstructorServices instructorServices;
	@Autowired
	TimingService timingService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	/**
	 * instructor services 
	 * @return
	 
	
	@RequestMapping(value = "/instructor4", method = RequestMethod.GET)
	public ModelAndView newEquipmentform() {
		ModelAndView modelView;
		
 		modelView = new ModelAndView("instructorForm");
 		modelView.addObject("instructor", new Instructor());
		return modelView;
	}*/
	
	@RequestMapping(value = "/instructorList", method = RequestMethod.GET)
	public ModelAndView processNewEquipmentprofile() 
	{
		ModelAndView modelView;
		

		List<Instructor> instructorlist;
		instructorlist = instructorServices.getintList();
 		modelView = new ModelAndView("instructorForm");
 		modelView.addObject("instructorlist", instructorlist);
		return modelView;
	}
	@RequestMapping(value = "/instructorList2", method = RequestMethod.GET)
	public ModelAndView processprofile() 
	{
		ModelAndView modelView;
		

		List<Instructor> instructorlist;
		instructorlist = instructorServices.getintList();
 		modelView = new ModelAndView("instructorlistform");
 		modelView.addObject("instructorlist", instructorlist);
		return modelView;
	}
	@RequestMapping(value = "/deleteInstr", method = RequestMethod.POST)
	public ModelAndView deleteeq(Instructor instr) {
		ModelAndView modelView;
		int id  = instr.getInstructorID();
		System.out.println("***************    id = "+id);
		instructorServices.deleteIns(id);
		timingService.deleteTiming(id);
		List<Instructor> instructorlist;
		instructorlist = instructorServices.getintList();
 		modelView = new ModelAndView("instructorlistform");
 		modelView.addObject("instructorlist", instructorlist);
 		
		return modelView;
	}
	@RequestMapping(value="/groupclasses",method = RequestMethod.GET)
	public ModelAndView groupclassesf(){
		ModelAndView modelview;
		modelview = new ModelAndView("groupClass");
		return modelview;
		
	}
	@RequestMapping(value="/classes_list",method = RequestMethod.GET)
	public ModelAndView groupclassesList(){
		ModelAndView modelview = null;
		List<Equipment> EquipmentList;
		//EquipmentList = eqipmentservice.getEquList();
 		//modelView = new ModelAndView("classes_list");
 		//modelView.addObject("EquipmentList", EquipmentList);
		return modelview;
	}
	
	@RequestMapping(value="/membershipinquiry", method = RequestMethod.GET)
	public ModelAndView inquery(){
		ModelAndView modelview;
		modelview = new ModelAndView("inquiry");
		modelview.addObject("user", new User());
		return modelview;
		
	}
	@RequestMapping(value = "/minquiry")
	public ModelAndView inqueryform(@Valid User user, BindingResult result, HttpSession session){
		ModelAndView modelview;
		if (result.hasErrors()) {
			modelview = new ModelAndView("inquiry", "user", user);
			return modelview;
		}
		modelview = new ModelAndView("membership_inquiry");
 		session.setAttribute("user", user);
		modelview.addObject("user", user);
		System.out.println(user.getEmailAddress());
		final String emailTo = user.getEmailAddress();
		final String subject = "29Gym details";
		final String yourmailid = "phataksonali22@gmail.com";
		final String message = "Membership, Daily Admission, Resident Youth Court Pass \nDue to various activities the whole gym may be closed during the year for league play, programs, or special events.\nDaily admission fees:\n Member access is free\nNon members: $4.00 per day\nNon-residents: $8.00 per day\n\nThe 10.00 court pass is for Youth Coppell residents, ages 10-17 years, who are interested in utilizing the basketball gym only. The court pass is good \nfor one year from the day that it is purchased.\n	Age Restriction and Supervision Policy\n\n10 years and older are allowed in the facility without adult supervision\n14-17 years old can supervise ONE child\n18 years old can supervise up to six children\n2 months to 9 years are allowed into our Sunshine Room (child care room)\n 5-12 years are allowed to utilize the indoor track upstairs with an adult only\n13 years and older can utilize the weight room facility, after FITLINXX orientation\n16 years and older are allowed to utilize the entire facility, including the weight room, unsupervised\n\nParks and Recreation\nCRDC Projects\nAquatic & Recreation Center\nGym Information\nFitness and Workout Facility\nLearn to Swim Lessons\n Membership and Pricing\nPool Information\nReservations\nSunshine Room Senior & Community Center\n Tennis Center\n Biodiversity Education Center\n Special Events and Block Parties\nRecConnect\nCamp Do It All\n\nCommunity Programs Athletics\n Lightning Prediction System\n Parks and Recreation Staff\n Parks and Rec Board\n Youth Sports Associations\n\n Thanks For interest in our GYM.\n";
		mailSender.send(new MimeMessagePreparator() {

			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
			MimeMessageHelper messageHelper = new MimeMessageHelper(
			mimeMessage, true, "UTF-8");
			messageHelper.setTo(emailTo);
			messageHelper.setSubject(subject);
			messageHelper.setReplyTo(yourmailid);
			messageHelper.setText(message);
			// determines if there is an upload file, attach it to the e-mail
			//String attachName = attachFile.getOriginalFilename();
			/*	if (!attachFile.equals("")) {

			messageHelper.addAttachment(attachName, new InputStreamSource() {
			@Override
			public InputStream getInputStream() throws IOException {
			return attachFile.getInputStream();
			}
			});
			}*/
			}

			});
				
		return modelview;
		
	}
	
}

package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.UserDao;
import model.Appuser;
 
@Controller
@RequestMapping("/")
public class AppController {
	
    @Autowired
    UserDao userDao;
    
    @Autowired
    MessageSource messageSource;
 
    /*
     * This method will provide a registration form for new user.
     */
    @RequestMapping(value = { "/", "/registration" }, method = RequestMethod.GET)
    public ModelAndView newUser() {
    	ModelAndView model = new ModelAndView();
        Appuser appuser = new Appuser();
        model.addObject("appuser", appuser);
        model.setViewName("/registration");
        return model;
    }
    
    /*
     * This method will be called on form submission, handling POST request for
     * saving user in database. It also validates the user input.
     */
    @RequestMapping(value = { "/", "/registration" }, method = RequestMethod.POST)
    public ModelAndView saveUser(@Valid Appuser appuser, BindingResult result) {
    	
    	//TODO
    	return null;
    }
    
    /*
     * This method will redirect the user to a welcome homepage after a successful registration.
     */
	@RequestMapping(value = "/successRegistration", method = RequestMethod.GET)
	public ModelAndView registered() {
		ModelAndView model = new ModelAndView();
		model.addObject("success", "Successful Registration");
		model.setViewName("/successRegistration");
		return model;
	}
    
}
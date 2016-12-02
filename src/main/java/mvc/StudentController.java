package mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import mvc.StudentJDBCTemplate;

import javax.validation.Valid;

@Controller
//@SessionAttributes("id")
public class StudentController {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("login", "user", new Student());
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("user") Student user) {
        if(studentJDBCTemplate.userCheck(user.getLogin(), user.getPassword())){
//            return new ModelAndView("result", "id", studentJDBCTemplate.findId(user.getLogin()));
            return new ModelAndView("result", "user", user);
        }else{return new ModelAndView("fail", "user", null);}






    }




    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "student", new Student());
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute("student") Student student) {

        studentJDBCTemplate.create(student.getLogin(), student.getPassword(), student.getAge(), student.getGender(), student.getSchool());

        return new ModelAndView("registration", "user", student);
    }
}
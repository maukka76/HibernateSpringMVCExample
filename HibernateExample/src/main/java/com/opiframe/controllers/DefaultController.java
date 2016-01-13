/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opiframe.controllers;

import com.opiframe.DAO.TeacherDAO;
import com.opiframe.pojos.CourseStudents;
import com.opiframe.pojos.Teachers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(ModelMap map){
        
        List<Teachers> lst = TeacherDAO.getAllTeachers();
        map.addAttribute("courses", new Teachers());
        map.addAttribute("teachers", lst);
        return "index";
    }
    
    @RequestMapping(value="/courses", method=RequestMethod.POST)
    public String getTeacherCourses(@ModelAttribute("courses")Teachers t,ModelMap map){
        List<String> courseName = new ArrayList();
        List<Integer> courseId = new ArrayList();
        List<Object[]> lst = TeacherDAO.getTeacherCourses(t.getTeacherName());
        for (Object[] temp : lst) {
            courseName.add((String)temp[0]);
            courseId.add((Integer)temp[1]);
        }
        map.addAttribute("name", t.getTeacherName());
        map.addAttribute("list", courseName);
        map.addAttribute("ids", courseId);
        return "courses";
    }
    
    @RequestMapping(value="/cinfo", method=RequestMethod.GET)
    public String getStudentsForCourse(@RequestParam("id")String id,ModelMap map){
        List<CourseStudents> cs = TeacherDAO.getStudentsByCourseId(id);
        
        if(!cs.isEmpty()){
            map.addAttribute("cName",cs.get(0).getCourses().getCourseName() );
            map.addAttribute("list", cs);
        }
        return "course_students";
    }
    
    @RequestMapping(value="/teacher", method=RequestMethod.GET)
    public String renderAddTeacher(ModelMap map){
        map.addAttribute("teacher",new Teachers());
        return "add_teacher";
    }
    
    @RequestMapping(value="/teacher", method=RequestMethod.POST)
    public String addNewTeacher(@ModelAttribute("teacher") Teachers teach){
        TeacherDAO.addNewTeacher(teach);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/testScript", method = RequestMethod.GET)
    public @ResponseBody List<String> listAllUsers() {
        List<String> dummy = new ArrayList();
        dummy.add("Tadaa");
        dummy.add("Padaa");
        dummy.add("FooBar");
        dummy.add("Trallalaa");
        return dummy;
    }
}

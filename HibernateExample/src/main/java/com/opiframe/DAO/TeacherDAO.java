/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opiframe.DAO;

import com.opiframe.pojos.CourseStudents;
import com.opiframe.pojos.Teachers;
import com.opiframe.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TeacherDAO {
    
    public static List<Teachers> getAllTeachers(){
        
        List<Teachers> lst = null;
        try{
           
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query hql = session.createQuery("FROM Teachers");
            lst = hql.list();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    
    public static List<Object[]> getTeacherCourses(String name){
        List<Object[]> lst = null;
        try{
            ProjectionList projList = Projections.projectionList();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Teachers.class,"teach");
            criteria.createCriteria("teach.courseses", "courseses");
            projList.add(Projections.property("courseses.courseName"));
            projList.add(Projections.property("courseses.courseId"));
            criteria.setProjection(projList);
            criteria.add(Restrictions.eq("teach.teacherName", name));
            lst = criteria.list();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    
    public static List<CourseStudents> getStudentsByCourseId(String id){
        
        List<CourseStudents> cs = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(CourseStudents.class,"cs");
            criteria.createCriteria("cs.students", "students");
            criteria.createCriteria("cs.courses", "courses");
            criteria.add(Restrictions.eq("courses.courseId", Integer.parseInt(id)));
            
            cs = criteria.list();
            for (CourseStudents data : cs) {
                
                Hibernate.initialize(data.getCourses().getCourseStudentses());
            }
           
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return cs;
    }
    
    public static void addNewTeacher(Teachers t){
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.save(t);
            trans.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package com.opiframe.pojos;
// Generated 15.1.2016 12:05:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Students generated by hbm2java
 */
public class Students  implements java.io.Serializable {


     private Integer studentId;
     private String studentName;
     private Set courseStudentses = new HashSet(0);

    public Students() {
    }

    public Students(String studentName, Set courseStudentses) {
       this.studentName = studentName;
       this.courseStudentses = courseStudentses;
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Set getCourseStudentses() {
        return this.courseStudentses;
    }
    
    public void setCourseStudentses(Set courseStudentses) {
        this.courseStudentses = courseStudentses;
    }




}



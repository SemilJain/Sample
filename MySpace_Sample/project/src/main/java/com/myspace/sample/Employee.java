package com.myspace.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String empname;
    private String loc;
    private int dept;

    public Employee() {
    }

    public Employee(String empname, String loc, int dept) {
        this.empname = empname;
        this.loc = loc;
        this.dept = dept;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return  "Employee name = "+ empname + " Employee location ="+ loc +" Employee deptID = "+ dept ;
    }




}
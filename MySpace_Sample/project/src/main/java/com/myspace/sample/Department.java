package com.myspace.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Department implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public Department() {
    }
    private int deptId;
    private String name;
    private int rating;

    public Department(int deptId, String name, int rating) {
        this.deptId = deptId;
        this.name = name;
        this.rating = rating;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return  "Department ID = "+ deptId + " Department name  ="+ name  +" Department rating = "+ rating ;
    }



}
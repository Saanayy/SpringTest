package com.example.company.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Employees {
    @Id
    ObjectId _id;
    String name, salary, eid;

    public Employees() {
    }

    public Employees(ObjectId _id, String name, String salary, String eid) {
        this._id = _id;
        this.name = name;
        this.salary = salary;
        this.eid = eid;
    }


    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
}

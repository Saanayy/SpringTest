package com.example.company;

import com.example.company.models.Employees;
import com.example.company.repositories.EmployeesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeesController {

    @Autowired
    private EmployeesRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employees getEmployeeById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    public Employees getEmployeeByName(@PathVariable("name") String name) {
//        return repository.findByName(name);
//    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Employees createEmployee(@Valid @RequestBody Employees emp) {
        emp.set_id(ObjectId.get());
        repository.save(emp);
        return emp;
    }
}

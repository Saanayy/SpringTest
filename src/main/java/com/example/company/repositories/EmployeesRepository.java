package com.example.company.repositories;

import com.example.company.models.Employees;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employees, String> {

    Employees findBy_id(ObjectId id);
    Employees findByName(String name);

}

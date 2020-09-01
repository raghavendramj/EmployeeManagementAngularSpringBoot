package com.assignment.wander.covid19dashboard.controller;

import com.assignment.wander.covid19dashboard.model.Employee;
import com.assignment.wander.covid19dashboard.service.EmployeeHardCodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeResource {

    @Autowired
    private EmployeeHardCodedService service;

    @GetMapping("/users/{username}/employees")
    public List<Employee> getAllEmployees(@PathVariable String username) {
        return service.findAll();
    }

    @GetMapping("/users/{username}/employees/{id}")
    public Employee getEmployee(@PathVariable String username, @PathVariable long id) {
        return service.findById(id);
    }

    @PutMapping("/users/{username}/employees/{id}")
    public ResponseEntity<Employee> udpateEmployee(@PathVariable String username, @PathVariable long id, @RequestBody Employee employee) {
        Employee employeeUpdated = service.save(employee);
        return new ResponseEntity<Employee>(employeeUpdated, HttpStatus.OK);
    }

    @PostMapping("/users/{username}/employees")
    public ResponseEntity<Employee> createEmployee(@PathVariable String username, @PathVariable long id, @RequestBody Employee employee) {
        Employee createdEmployee = service.save(employee);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdEmployee.getEmpId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/users/{username}/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String username, @PathVariable long id) {

        Employee employee = service.deleteById(id);
        if (employee != null)
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.notFound().build();
    }
}

package com.technocart.ds.datastructures.basic;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.*;

public class StreamCollectors {

    public static void main(String[] args) {
        Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
        Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
        Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
        Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
        Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");
        List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);

        //Averaging the salary of all the employes
        System.out.println(employees.stream().collect(averagingDouble(Employee::getSalary)));

        //Summing the total salary
        System.out.println(employees.stream().collect(summingDouble(Employee::getSalary)));

        //finding max salary
        Double max = employees.stream().collect(collectingAndThen(maxBy(comparingDouble(Employee::getSalary)), emp -> emp.get().getSalary()));
        System.out.println(max);


        //mapping employee name
        List<String> employeeNames = employees.stream().collect(mapping(Employee::getName, toList()));
        System.out.println(employeeNames);

        //joining employee names
        String employeeNamesStr = employees.stream().map(Employee::getName).collect(joining(","));
        System.out.println(employeeNamesStr);

        //joining employee names in specific format
        String employeeNamesStrng = employees.stream().map(Employee::getName).collect(joining(", ", "Employees = {", "}"));
        System.out.println(employeeNamesStrng);
    }
}


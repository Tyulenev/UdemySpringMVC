package ru.Tyulenev.Spring.MVC;

import javax.swing.plaf.DesktopPaneUI;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be grater than 2 symbols") //Минимальный размер имени
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrend;
    private Map<String,String> carBrends;
    private String[] languages;
    private Map<String,String> langList;


    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technologies");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");

        carBrends = new HashMap<>();
        carBrends.put("MBW", "BMW");
        carBrends.put("Audi", "Audi");
        carBrends.put("Mersedes Bens", "MB");
        carBrends.put("Mazda", "Mazda");

        langList = new HashMap<>();
        langList.put("English", "EN");
        langList.put("Deutch", "DE");
        langList.put("French", "FR");
        langList.put("Chineez", "CH");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
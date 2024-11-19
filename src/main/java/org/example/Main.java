package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Main.run();
    }

    public static void run() {
        // Healthplan
        Healthplan basicPlan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        System.out.println(basicPlan);

        // (healthplans dizisi String[] tipinde olmalı)
        String[] healthplans = new String[3];  // Sağlık planlarını tutacak dizi
        Employee employee = new Employee(101, "John Doe", "john.doe@example.com", "password123", healthplans);

        // Sağlık planları
        employee.addHealthPlan(0, "Basic Health Plan");
        employee.addHealthPlan(1, "Premium Health Plan");
        employee.addHealthPlan(1, "VIP Health Plan"); // Error mesajı basılmalı
        System.out.println(employee);

        // Company oluştur (developerNames dizisi String[] tipinde olmalı)
        String[] developerNames = new String[5];  // Geliştiricilerin ismini tutacak dizi
        Company company = new Company(201, "TechCorp", 1_000_000.0, developerNames);

        // Çalışanlar
        company.addEmployee(0, "John Doe");
        company.addEmployee(0, "Jane Smith"); // Error mesajı basılmalı
        System.out.println(company);
    }
}

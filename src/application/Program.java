package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nameDept = sc.next();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String phone = sc.next();

        Address address = new Address(email, phone);
        Department departt = new Department(nameDept, payDay, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Employee employee = new Employee(name, salario);

            departt.addEmployee(employee);
        }
        System.out.println();

        showReport(departt);

        sc.close();
    }

    private static void showReport(Department dept) {

        System.out.println(dept.toString());
    }

}


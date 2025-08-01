package Activity;

import java.util.Scanner;

class Employees {
    int id;
    String name;
    String position;
    double salary;
    
    Employees(){}


    public Employees(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    
    public void viewEmp(Employees[] empArr, int count) {
        for (int i = 0; i < count; i++) {
        	Employees emp = empArr[i];
            if (emp != null) {
                System.out.println("Employee Id: " + emp.id);
                System.out.println("Employee Name: " + emp.name);
                System.out.println("Employee Position: " + emp.position);
                System.out.println("Employee Salary: " + emp.salary);
                System.out.println("-----------------------------");
            }
        }
    }

    
    public int addEmp(Employees[] empArr, int count, Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Position: ");
        String position = sc.nextLine().trim();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        empArr[count] = new Employees(id, name, position, salary);
        System.out.println("Employee added successfully!");
        return count + 1;
    }

    
    public void sbynameEmp(Employees[] empArr, int count, Scanner sc) {
        System.out.print("Enter name to search: ");
        String search = sc.nextLine().toLowerCase().trim();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (empArr[i].name.toLowerCase().contains(search)) {
            	Employees e = empArr[i];
                System.out.println("Id: " + e.id + ", Name: " + e.name + ", Position: " + e.position + ", Salary: " + e.salary);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found with name containing: " + search);
        }
    }

    
    public void updateEmp(Employees[] empArr, int count, Scanner sc) {
        System.out.print("Enter Id to update: ");
        int idToUpdate = Integer.parseInt(sc.nextLine().trim());

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (empArr[i].id == idToUpdate) {
                System.out.print("Enter new Name: ");
                empArr[i].name = sc.nextLine().trim();

                System.out.print("Enter new Position: ");
                empArr[i].position = sc.nextLine().trim();

                System.out.print("Enter new Salary: ");
                empArr[i].salary = Double.parseDouble(sc.nextLine().trim());

                System.out.println("Employee updated successfully.\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + idToUpdate + " not found.\n");
        }
    }

    
    public int deleteEmp(Employees[] empArr, int count, Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int idDelete = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (empArr[i].id == idDelete) {
                for (int j = i; j < count - 1; j++) {
                    empArr[j] = empArr[j + 1];
                }
                empArr[count - 1] = null;
                System.out.println("Employee deleted successfully.");
                found = true;
                count--;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee ID " + idDelete + " not found");
        }
        return count;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees[] empArr = new Employees[100];
        Employees empH = new Employees();
        int count = 0;

        while (true) {
            System.out.println("\n Employee Management Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search by Name");
            System.out.println("4. Update Employee by ID");
            System.out.println("5. Delete Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    count = empH.addEmp(empArr, count, sc);
                    break;
                case 2:
                	empH.viewEmp(empArr, count);
                    break;
                case 3:
                	empH.sbynameEmp(empArr, count, sc);
                    break;
                case 4:
                	empH.updateEmp(empArr, count, sc);
                    break;
                case 5:
                    count = empH.deleteEmp(empArr, count, sc);
                    break;
                case 6:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}



//        1- ADD , 2-View , 3-Update , 4- Delete , 5 - Exite"
/*
 *  Create an employee class (id,name ,position and salary) then create an array of employee objects and then
 * create a menu driven program  to add , view, search by name(where string contains , ignore case),
 * Update employee by ID , delete employee by ID and then exit
 * 
 * also use some of string operations like .equalsIngnoreCase , .contains , .toLowerCase for search and .trim for input cleaning.
 * */


/*
 * 
 * Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        System.out.println("\nSearch Results:");
        for (EmployeeMain emp : empList) {
            if (emp.name.equalsIgnoreCase(searchName)) {
                emp.displayEmp();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found with name: " + searchName);
        }
 * */

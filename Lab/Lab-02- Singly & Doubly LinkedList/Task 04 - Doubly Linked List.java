import java.util.Scanner;
class Patient {
    int id;
    String name;
    int age;
    String bloodgroup;
    
    Patient(int id, String name, int age, String bloodgroup) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bloodgroup = bloodgroup;
    }
}

class WRM {
    private DoublyNode head;
    
    WRM() {
        this.head = new DoublyNode(null);
        this.head.next = this.head;
        this.head.prev = this.head;
    }
    
    void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup);
        DoublyNode newNode = new DoublyNode(newPatient);
        DoublyNode tail = this.head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = this.head;
        this.head.prev = newNode;
    }
    
    String servePatient() {
        if (this.head.next == this.head) {
            return "No patients in the waiting room";
        }
        DoublyNode servedNode = this.head.next;
        Patient servedPatient = servedNode.elem;
        this.head.next = servedNode.next;
        servedNode.next.prev = this.head;
        return "Serving Patient : " + servedPatient.name;
    }
    
    String cancelAll() {
        this.head.next = this.head;
        this.head.prev = this.head;
        return "All appointments canceled.";
    }
    
    boolean canDoctorGoHome() {
        return this.head.next == this.head;
    }
    
    String showAllPatients() {
        if (this.head.next == this.head) {
            return "No patients in the waiting room";
        }
        StringBuilder result = new StringBuilder();
        DoublyNode current = this.head.next;
        while (current != this.head) {
            Patient patient = current.elem;
            result.append("Name: ").append(patient.name).append(" : ID: ").append(patient.id).append("\n");
            current = current.next;
        }
        return result.toString();
    }
    
    String reverseTheLine() {
        if (this.head.next == this.head) {
            return "No patients in the waiting room";
        }
        DoublyNode current = this.head.next;
        while (current != this.head) {
            DoublyNode temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
        this.head.next = this.head.prev;
        this.head.prev = current;
        return "Line reversed successfully.";
    }
}

public class WRMTester {
   public static void main(String[] args) {
        System.out.println("**Welcome to Waiting Room Management System**");
        WRM wrm = new WRM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Patient");
            System.out.println("3. Show All Patients");
            System.out.println("4. Can Doctor Go Home?");
            System.out.println("5. Cancel All Appointments");
            System.out.println("6. Reverse The Line");
            System.out.println("7. Quit");

            System.out.print("Choose option: ");
            String n = scanner.nextLine();

            switch (n) {
                case "1":
                    System.out.print("Enter patient ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    String age = scanner.nextLine();
                    System.out.print("Enter patient blood group: ");
                    String bloodgroup = scanner.nextLine();
                    wrm.registerPatient(id, name, age, bloodgroup);
                    System.out.println("Patient added successfully!");
                    break;
                
                case "2":
                    System.out.println(wrm.servePatient());
                    break;
                
                case "3":
                    System.out.println("Patients in sequence to serve: ");
                    System.out.println(wrm.showAllPatients());
                    break;
                
                case "4":
                    if (wrm.canDoctorGoHome()) {
                        System.out.println("Yes, the doctor can go home.");
                    } else {
                        System.out.println("No, there are patients waiting.");
                    }
                    break;
                
                case "5":
                    wrm.cancelAll();
                    System.out.println("All appointments canceled.");
                    break;
                
                case "6":
                    System.out.println(wrm.reverseTheLine());
                    break;
                
                case "7":
                    System.out.println("Thank you");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

package student;

import java.util.Scanner;

public class persion {

    String name;
    String email;
    int id;
    public void display(){
        System.out.println("Id" + this.id);

        System.out.println("Name" + this.name);

        System.out.println("Email" + this.email);

    }
    public void inputData(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = input.nextLine();

        System.out.println("Enter Email: ");
        this.email = input.nextLine();

        System.out.println("Enter Id: ");
        this.id= input.nextInt();

        System.out.println(" Input completed ");
    }
}

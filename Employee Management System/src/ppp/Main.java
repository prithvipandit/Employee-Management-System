package ppp;
//import predefined modules
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int d=0;
        String filename="employeeDetails.txt"; //file name

        while(d!=3){
            //made condition which will run again and again till d is not equal
            System.out.println("Main Menu");
            System.out.println("1.Add an employee");
            System.out.println("2.Display All");
            System.out.println("3.Exit");
            d=sc.nextInt();
//c=d;
//condition if d is 1 then we take details of employees and store them in .txt file
            if(d==1){
                System.out.print("Enter Employee ID: ");
                int a=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String b=sc.nextLine();
                System.out.print("Enter Employee Age: ");
                int f=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Salary: ");
                float e=sc.nextInt();
                sc.nextLine();
                try{
                    BufferedWriter writ = new BufferedWriter(new FileWriter(filename,true));
                    writ.write(a+" ");
                    writ.write(b+" ");
                    writ.write(f+" ");
                    writ.write(e+" ");
                    writ.write("\n");
                    writ.close();
                }
                catch(IOException h){
                    System.out.println("Exception occured");
                }
            }
//condition if d is 2 then details stored in file about the employees will be displayed
            else if(d==2)
            {
                System.out.println("----Report----");
                try{
                    String Line;
                    BufferedReader bufferedReader = new BufferedReader(new
                            FileReader(filename));
                    while ((Line = bufferedReader.readLine()) != null){
                        System.out.println(Line);
                    }
                }
                catch(IOException h){
                    System.out.println("Exception occured");
                }
            }
//if d is 3 then it will terminate the program
            else{
                System.out.println("Exit");
            }
        }
    }
}


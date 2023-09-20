/**
 * This program belongs to Yousuf Habouh.
 */

import java.util.Scanner;

public class testing {
    public static Scanner keyboard = new Scanner(System.in);
    public static FiuStudent stud1, stud2, stud3;
    public static boolean doesStud3Exist = false;
    public static void main(String[] args){
        System.out.println("You will now create two student profiles.\n");
        stud1 = createStudentProfile();
        System.out.println("\nYou will now create the second profile.\n");
        stud2 = createStudentProfile();

        System.out.printf("\nThe first student has the following profile: \n%s\n\n" +
                "The second student has the following profile: \n%s\n\n", stud1.toString(), stud2.toString());

        System.out.println("Do you wish to create a third profile? Put \"true\" for yes and \"false\" for no");
        if(keyboard.nextBoolean()){
            keyboard.nextLine();
            stud3 = createStudentProfile();
            doesStud3Exist = true;

        } else {keyboard.nextLine();}
        boolean endProgram = false;
        while (!endProgram) {
            System.out.println("\nDo you wish to view a detail of a student profile, update a detail of a student profile, or exit program?");
            System.out.println("Put \"view\", \"update\", or anything else to exit program.");
            String nextAction = keyboard.nextLine();
            if(nextAction.equals("view")){
                viewProfile();
            } else if (nextAction.equals("update")) {
                updateProfile();
            } else {
                endProgram = true;
            }
        }
    }

    public static FiuStudent createStudentProfile(){
        String name, pantherEmail, major;
        int pantherID;
        boolean hasHold;
        System.out.println("What is the student's name?");
        name = keyboard.nextLine();
        System.out.println("What is the student's panther email address?");
        pantherEmail = keyboard.nextLine();
        System.out.println("What is the student's panther ID?");
        pantherID = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the student's major? Set as \"Exploratory\" if unknown.");
        major = keyboard.nextLine();
        System.out.println("Does the student have a hold? Put \"true\" if yes and put \"false\" if no.");
        hasHold = keyboard.nextBoolean();
        keyboard.nextLine();

        return new FiuStudent(name, major, pantherEmail, pantherID, hasHold);
    }

    public static void viewProfile(){
        System.out.println("Which student profile has the detail you want to view? Example: put \"1\" for profile 1.");
        int profile = keyboard.nextInt();
        keyboard.nextLine();
        if(profile==1){
            viewDetail(stud1);
        } else if(profile==2){
            viewDetail(stud2);
        }else if(profile==3 & doesStud3Exist){
            viewDetail(stud3);
        }else {
            System.out.println("Profile does not exist.");
        }
    }

    public static void updateProfile(){
        System.out.println("Which student profile has the detail you want to edit? Example: put \"1\" for profile 1.");
        int profile = keyboard.nextInt();
        keyboard.nextLine();
        if(profile==1){
            updateDetail(stud1);
        } else if(profile==2){
            updateDetail(stud2);
        }else if(profile==3 & doesStud3Exist){
            updateDetail(stud3);
        }else {
            System.out.println("Profile does not exist.");
        }
    }

    public static void viewDetail(FiuStudent student){
        System.out.println("Put the integer which represents the detail you wish to view: ");
        System.out.println("1 = name, 2 = major, 3 = email, 4 = panther ID, 5 = hold status");
        int whichDetail = keyboard.nextInt();
        keyboard.nextLine();
        if(whichDetail==1){
            System.out.println("Student " + student.getName() + " has name " + student.getName());
        } else if(whichDetail==2){
            System.out.println("Student " + student.getName() + " has major " + student.getMajor());
        } else if(whichDetail==3){
            System.out.println("Student " + student.getName() + " has email " + student.getPantherEmail());
        } else if(whichDetail==4){
            System.out.println("Student " + student.getName() + " has ID " + student.getPantherID());
        } else if(whichDetail==5){
            System.out.println("Student " + student.getName() + " has hold status: " + student.getHasHold());
        } else {
            System.out.println("Error, bad input.");
        }
    }

    public static void updateDetail(FiuStudent student){
        System.out.println("Put the integer which represents the detail you wish to update: ");
        System.out.println("1 = name, 2 = major, 3 = email, 4 = panther ID, 5 = hold status");
        int whichDetail = keyboard.nextInt();
        keyboard.nextLine();
        String oldName = student.getName();
        if(whichDetail==1){
            System.out.println(student.getName() + "'s name is " + student.getName() + ", please input new name: \n");
            student.setName(keyboard.nextLine());
            System.out.println(oldName + "has been changed to " + student.getName());

        } else if(whichDetail==2){
            System.out.println(student.getName() + "'s major is " + student.getMajor() + ", please input new major: \n");
            student.setMajor(keyboard.nextLine());
            System.out.println(student.getName() + "'s major has been changed to " + student.getMajor());

        } else if(whichDetail==3){
            System.out.println(student.getName() + "'s email is " + student.getPantherEmail() + ", please input new email: \n");
            student.setPantherEmail(keyboard.nextLine());
            System.out.println(student.getName() + "'s email has been changed to " + student.getPantherEmail());

        } else if(whichDetail==4){
            System.out.println(student.getName() + "'s panther ID is " + student.getPantherID() + ", please input new ID number: \n");
            student.setPantherID(keyboard.nextInt());
            System.out.println(student.getName() + "'s panther ID has been changed to " + student.getPantherID());

        } else if(whichDetail==5){
            System.out.println(student.getName() + "'s hold status is \"" + student.getHasHold() + ",\"" +
                    "please update hold status as \"true\" or \"false\": \n");
            student.setHasHold(keyboard.nextBoolean());
            keyboard.nextLine();
            System.out.println(student.getName() + "'s hold status is currently " + student.getHasHold());

        } else {
            System.out.println("Error, bad input.");
        }
    }

}
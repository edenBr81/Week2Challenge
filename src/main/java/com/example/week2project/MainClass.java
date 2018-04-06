package com.example.week2project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        boolean condition = false;
        Scanner scan = new Scanner(System.in);
        Resume newResume;
        String answer;

        ArrayList<Resume> resumes = new ArrayList<>();
        do{
            newResume = new Resume();
        System.out.println("Enter Your First Name:");
        newResume.setFirstname(scan.nextLine());
        System.out.println("Enter Your Last Name:");
        newResume.setLastname(scan.nextLine());
        System.out.println("Enter Your Email:");
        newResume.setEmail(scan.nextLine());
        System.out.println("Enter Your Phone Number:");
        newResume.setPhonenumber(scan.nextLine());
        System.out.println("Enter Your Address:");
        newResume.setAddress(scan.nextLine());
        System.out.println("Enter Your Education:");
        newResume.setEducation(scan.nextLine());
        System.out.println("Enter Your Experience:");
        newResume.setExperience(scan.nextLine());
        System.out.println("Enter Your Skill:");
        newResume.setSkill(scan.nextLine());
            resumes.add(newResume);
            System.out.println("Would You Like to enter details of your Education,Experience and Skills?");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                condition = true;
                } else {
                System.out.println("Enter your Degree:");
                newResume.setDegree(scan.nextLine());
                System.out.println("Enter Year:");
                newResume.setYear(scan.nextDouble());
                scan.nextLine();
                System.out.println("Enter your Title:");
                newResume.setTitle(scan.nextLine());
                System.out.println("Enter Your Organization:");
                newResume.setOrganization(scan.nextLine());
                System.out.println("Enter Inistitutions:");
                newResume.setInstitution(scan.nextLine());
                System.out.println("Enter your details Skills:");
                newResume.setSkill(scan.nextLine());
                System.out.println("Enter your proficiency:");
                newResume.setProficiency(scan.nextLine());

            }
                System.out.println("Would You Like to enter another details?");
                answer=scan.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                    condition = true;
                        }

                }while(!condition);


            for(Resume eachresume:resumes){
                System.out.println("These are information that You have entered");
                System.out.println("*******************************************");
                System.out.println("PERSONAL INFORMATION");
                System.out.println("............................................");
                System.out.println("Full Name:"+eachresume.getFirstname() +eachresume.getLastname());
                System.out.println("Email:"+eachresume.getEmail());
                System.out.println("Phone Number:"+eachresume.getPhonenumber());
                System.out.println("Address:"+eachresume.getAddress());
                System.out.println("*********************************************");
                System.out.println("EDUCATION INFORMATION");
                System.out.println(".............................................");
                System.out.println("Education:"+eachresume.getEducation());
                System.out.println("Degree:"+eachresume.getDegree());
                System.out.println("Year:"+eachresume.getYear());
                System.out.println("*********************************************");
                System.out.println("WORK EXPIREINCE ");
                System.out.println(".............................................");
                System.out.println("Expirience:"+eachresume.getExperience());
                System.out.println("Title:"+eachresume.getTitle());
                System.out.println("Organization:"+eachresume.getOrganization());
                System.out.println("*********************************************");
                System.out.println("SKILLS INFORMATION");
                System.out.println(".............................................");
                System.out.println("Skill:"+eachresume.getSkill());
                System.out.println("Proficiency:"+eachresume.getProficiency());
            }

        }


    }


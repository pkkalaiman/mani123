/*
 * package com.xworkz.abstractionapp.hospitalapp.interfaceapp;
 * 
 * import java.util.Scanner;
 * 
 * import com.xworkz.abstractionapp.abstraction.Patient;
 * 
 * 
 * public class AppolloTester {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc=new Scanner(System.in); System.out.println("enter the Size"); int
 * size =sc.nextInt();
 * 
 * //AppolloHospitalImpl appoloHospital = new AppolloHospitalImpl();
 * 
 * for(int i=0;i<size;i++) {
 * 
 * Patient patient =new Patient(null, size, null, null);
 * 
 * System.out.println("enter patient name"); patient.setName(sc.next());
 * 
 * System.out.println("enter patient age "); //patient.setName(sc.nextInt());
 * 
 * System.out.println("enter patient gender "); String gender=sc.next();
 * patient.setGender(Gender.valueOf(gender));
 * 
 * 
 * System.out.println("enter patient Address "); patient.setAddress(sc.next());
 * 
 * 
 * //appoloHospitalImpl.addPatient(patient);
 * 
 * }
 * 
 * 
 * Hospital.getAllPatients();
 * 
 * 
 * System.out.println("Get Patient Detailes by name");
 * AppolloHospitalImpl.getPatientByName(sc.next());
 * 
 * 
 * System.out.println("Get Patient Detailes by age");
 * Hospital.getPatientbyAge(sc.nextInt());
 * 
 * 
 * System.out.println("Get Patient Detailes by gender");
 * Hospital.getGenderBygenderName(sc.next());
 * 
 * System.out.println("Get Patient Detailes by Address");
 * Hospital.getPatientbyAddress(sc.next());
 * 
 * 
 * System.out.println("Get Patient Gender by using Name");
 * Hospital.getGenderBygenderName(sc.next());;
 * 
 * System.out.println("Get Patient Name by using Gender");
 * Hospital.getGenderBygenderName(sc.next());
 * 
 * 
 * 
 * for(int i=0;i<size;i++) {
 * 
 * Patient patient =new Patient(null, size, null, null);
 * 
 * System.out.println("Enter the updateAddressByName");
 * Hospital.getAllPatients();
 * 
 * //AppolloHospital UpdateAgeByName (name,newAge);
 * 
 * }
 * 
 * 
 * 
 * System.out.println("Enter the patient Name to Delete"); String patientName =
 * sc.next();
 * 
 * appoloHospital.deletePatientByName(patientName);
 * 
 * appoloHospital.getAllnewPatients();
 * 
 * 
 * 
 * sc.close(); } }
 * 
 * 
 */
package com.emids.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateQuoteController
 */
public class GenerateQuoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String OUTPUT_PREFIX="Health Insurance Premium for ";
	public static final String MR="Mr. ";
	public static final String MRS="Mrs. ";
	public static final String RS=": Rs. ";	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenerateQuoteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		//reading the form values
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String age=request.getParameter("age");
		String hypertension=request.getParameter("hypertension");
		String blood_pressure=request.getParameter("blood_pressure");
		String blood_sugar=request.getParameter("blood_sugar");
		String overweight=request.getParameter("overweight");
		String smoking=request.getParameter("smoking");
		String alcohol=request.getParameter("alcohol");
		String daily_exercise=request.getParameter("daily_exercise");
		String drugs=request.getParameter("drugs");
		int ageInt=Integer.parseInt(age);

		//calculating quote
		double premium = 5000;
		premium = calculatePremiumByAge(premium,ageInt);
		premium = calculatePremiumByGender(premium, gender);
		//current health
		int percentageIncrease=0;		
		if(hypertension.equals("Yes")){
			percentageIncrease+=1;
		}
		if(blood_pressure.equals("Yes")){
			percentageIncrease+=1;
		}
		if(blood_sugar.equals("Yes")){
			percentageIncrease+=1;
		}
		if(overweight.equals("Yes")){
			percentageIncrease+=1;
		}
		
		premium+=(premium*percentageIncrease)/100;

		//habits wise premium
		percentageIncrease=0;
		if(daily_exercise.equals("Yes")){
			percentageIncrease-=3;
		}
		if(smoking.equals("Yes")){
			percentageIncrease+=3;
		}
		if(alcohol.equals("Yes")){
			percentageIncrease+=3;
		}		
		if(drugs.equals("Yes")){
			percentageIncrease+=3;
		}
		premium+=(premium*percentageIncrease)/100;
		
		//output format
		StringBuilder sb=new StringBuilder();
		sb.append(OUTPUT_PREFIX);
		if(gender.equals("Male")){
			sb.append(MR);
		}
		if(gender.equals("Female")){
			sb.append(MRS);
		}

		sb.append(name+RS);
		sb.append((int)Math.ceil(premium));
		out.println(sb.toString());
	}

	public double calculatePremiumByAge(double premium,int age){
		if(age>=18){
			premium+=(premium*10)/100;
		}
		if(age>=25){
			premium+=(premium*10)/100;
		}
		if(age>=30){
			premium+=(premium*10)/100;
		}
		if(age>=35){
			premium+=(premium*10)/100;
		}
		if(age>=40){
			for(int i=40;i<=age;i=i+5){
				premium+=(premium*20)/100;
			}		
		}
		return premium;
	}

	public double calculatePremiumByGender(double premium,String gender ){
		if(gender.equals("Male")){
			premium+=(premium*2)/100;
		}
		return premium;
	}	


}

package com.xworkz.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/Mani")
public class BankApplicationServer extends HttpServlet {

	public BankApplicationServer() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in do Get BankServer Method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Runnin in Do Post method........");
		String data = "Printing the message in do Post method on Message BankApplication";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");

	}
}

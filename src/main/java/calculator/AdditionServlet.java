package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String num1=req.getParameter("num1");
//		how to convert string to int
//		Parseing
		
		int number1=Integer.parseInt(num1);
		int number2=Integer.parseInt(req.getParameter("num2"));
		
		
		int result=number1+number2;
		PrintWriter printWriter=res.getWriter();
		printWriter.print("Addition of two numbers is ::"+result);
	}

}

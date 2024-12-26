package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 학생 정보 등록
 * url : /student/register
 */
// http://localhost:8892/student/register?name=삼용자&firstScore=77&secondScore=66
@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> sList = new ArrayList<Student>();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher view;
		
		String name = request.getParameter("name");
		int firstScore = Integer.parseInt(request.getParameter("firstScore"));
		int secondScore = Integer.parseInt(request.getParameter("secondScore"));
		
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",77,88));
		for(Student std : sList) {
			out.println(std.getName()+"의 1차 점수는 "+std.getFirstScore()+", 2차 점수는 "+std.getSecondScore()+"입니다.<br>");
		}
		
		for(Student std : sList) {
			if(name.equals(std.getName())){
				view = request.getRequestDispatcher("/WEB-INF/views/common/duplicate.html");
				view.forward(request, response);
				out.println("이미 존재하는 이름입니다.");
				return; // 메소드를 종료하여 밑에 코드가 안 돌아가도록 함.
			}
		}
		
		sList.add(new Student(name,firstScore,secondScore));
		out.println(name+"의 1차 점수는 "+firstScore+", 2차 점수는 "+secondScore+"입니다.<br>");
		out.println("가입이 완료되었습니다.");
		view = request.getRequestDispatcher("/WEB-INF/views/common/success.html");
		view.forward(request, response);
//		for(Student std : sList) {
//			name = std.getName();
//			firstScore = std.getFirstScore();
//			secondScore = std.getSecondScore();
//			out.println(name+"의 1차 점수는 "+firstScore+", 2차 점수는 "+secondScore+"입니다.<br>");
//		}
	
	}
}

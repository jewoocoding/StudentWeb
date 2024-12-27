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
 * 학생 정보 삭제
 * url : ??
 */
@WebServlet("/student/remove")
public class StudentRemoveServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view;
		
		// 학생 리스트 생성
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",88,77));
		sList.add(new Student("삼용자",77,66));
		sList.add(new Student("사용자",66,55));
		// 이름이 입력된다고 했을 때
		// 해당 이름이 있으면 지우고 없으면 이름이 없다고 메세지 출력하도록
		// 코드를 작성해보세요~
		
		String name = request.getParameter("name");
		
		// 웹페이지에 출력하게 해주는 객체
//		PrintWriter out = response.getWriter();
		// 한글 깨지지 않게 해줌
//		response.setContentType("text/html; charset=UTF-8");
		
		// 학생 리스트 출력
//		for(Student std : sList) {
//			System.out.println(std);
//			out.println(std+"<br>");
//		}
		// 일용자 삭제
//		out.println("일용자 삭제<br>");
//		sList.remove(0);
//		out.println("<br>");
		
		// 일용자 삭제후 리스트 출력
//		for(Student std : sList) {
//			System.out.println(std);
//			out.println(std+"<br>");
//		}
		
		String stdListOut1 = "";
		for(Student std : sList) {
			stdListOut1 += std.toString()+"<br>";
		}
		request.setAttribute("stdList1", stdListOut1);
		
		
		// 입력된 이름이 있으면 삭제, 없으면 없다고 출력
		String message = "";
		for(int i=0; i<sList.size();i++) {
			if(name.equals(sList.get(i).getName())) {
				message = "이름이 있습니다. 삭제하겠습니다.";
				sList.remove(i);
				break;
			}else {
				message = "그런 이름을 가진 학생은 없습니다.";
			}
		}
//		out.println("<br>");
		view = request.getRequestDispatcher("/WEB-INF/views/student/removeStudent.jsp");
		request.setAttribute("message", message);
//		
//		out.println(message);
//		out.println("<br>");
		// 학생 리스트 출력
//		for(Student std : sList) {
//			System.out.println(std);
//			out.println(std+"<br>");
//		}
		// 학생리스트 전달
		String stdListOut2 = "";
		for(Student std : sList) {
			stdListOut2 += std.toString()+"<br>";
		}
		request.setAttribute("stdList2", stdListOut2);
		view.forward(request, response);
	}
}

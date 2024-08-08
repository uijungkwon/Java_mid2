package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 1. 파라미터 전송 기능
 *http://localhost:8080/request-param?username=hello&age=20
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + "=" + request.getParameter(paramName)));
        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();

        System.out.println("[단일 파라미터 조회]");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("age = " + age);//파라미터 한개만 조회하고 출력하기

        System.out.println("[이름이 같은 복수 파라미터 조회]"); //username을 여러번 입력할 수 있음
        /*http://localhost:8080/request-param?username=hello&age=20&username=uijung*/
        String[] usernames = request.getParameterValues("username");
        for(String name : usernames){
            System.out.println("name = " + name);
        }
        response.getWriter().write("OK");//웹 브라우저 화면에 보여주는 문자
    }
    
}

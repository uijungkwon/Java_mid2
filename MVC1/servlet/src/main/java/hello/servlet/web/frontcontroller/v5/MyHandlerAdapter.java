package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object handler); //handler == controller //어댑터가 해당 컨트롤러를 처리할 수 있는지 확인하는 메소드
    ModelView handle(HttpServletRequest request, HttpServletResponse response,Object handler) throws ServletException, IOException;
} // 어댑터를 통해서 실제 컨트롤러 호출 후 모델 뷰 반환

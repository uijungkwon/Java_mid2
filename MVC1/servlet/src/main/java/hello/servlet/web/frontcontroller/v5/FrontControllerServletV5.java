package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import hello.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;
import hello.servlet.web.frontcontroller.v5.adapter.ControllerV3HandlerAdapter;
import hello.servlet.web.frontcontroller.v5.adapter.ControllerV4HandlerAdapter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServletV5", urlPatterns = "/front-controller/ v5/*")
public class FrontControllerServletV5 extends HttpServlet {
 private final Map<String, Object> handlerMappingMap = new HashMap<>();
 private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();
 public FrontControllerServletV5() {
    initHandlerMappingMap(); //핸들러 매핑 초기화
    initHandlerAdapters(); // 어댑터 초기화
 }
 private void initHandlerMappingMap() { //컨트롤러 보다 더 넓은 범위의 의미인 핸들러 사용
    handlerMappingMap.put("/front-controller/v5/v3/members/new-form", new MemberFormControllerV3());
    handlerMappingMap.put("/front-controller/v5/v3/members/save", new MemberSaveControllerV3());
    handlerMappingMap.put("/front-controller/v5/v3/members", new MemberListControllerV3());

     //V4 추가
     handlerMappingMap.put("/front-controller/v5/v4/members/new-form", new
             MemberFormControllerV4());
     handlerMappingMap.put("/front-controller/v5/v4/members/save", new
             MemberSaveControllerV4());
     handlerMappingMap.put("/front-controller/v5/v4/members", new
             MemberListControllerV4());
 }
 private void initHandlerAdapters() {
    handlerAdapters.add(new ControllerV3HandlerAdapter());
     handlerAdapters.add(new ControllerV4HandlerAdapter()); //V4 추가
 }
 @Override
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Object handler = getHandler(request); //핸들러 매핑

    if (handler == null) {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return;
 }
    MyHandlerAdapter adapter = getHandlerAdapter(handler);

    //어댑터 호출 - 어댑터는 핸들러(컨트롤러)를 호출하고 그 결과를 어댑터에 맞춰 반환한다.
    ModelView mv = adapter.handle(request, response, handler);

    MyView view = viewResolver(mv.getViewName());
    view.render(mv.getModel(), request, response);
 }
 private Object getHandler(HttpServletRequest request) {//핸들러 매핑
    String requestURI = request.getRequestURI();
    return handlerMappingMap.get(requestURI);
 }
 private MyHandlerAdapter getHandlerAdapter(Object handler) {//핸들러를 처리할 수 있는 어댑터 조회
    for (MyHandlerAdapter adapter : handlerAdapters) {
        if (adapter.supports(handler)) { //핸들러를 처리할 수 있는 어댑터를 이 코드를 통해서 찾는다.
            return adapter;
 }
 }
        throw new IllegalArgumentException("handler adapter를 찾을 수 없습니다. handler=" + handler);
        }
 private MyView viewResolver(String viewName) {
    return new MyView("/WEB-INF/views/" + viewName + ".jsp");
 }
}

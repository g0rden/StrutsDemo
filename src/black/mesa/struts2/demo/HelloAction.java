package black.mesa.struts2.demo;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction {
    public String sayHi() {
        System.out.println("hello world");
        return "success";
    }
}

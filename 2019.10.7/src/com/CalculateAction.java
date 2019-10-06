package com;
import java.sql.*;
import javax.script.*;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
public class CalculateAction extends ActionSupport{
    private String flag;
    private  String value1;
    private  String value2;
    private String Calcultext;
    public String getFlag() {
        return flag;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public void setFlag(String flag) {

        this.flag = flag;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String calculate(){
        Calcultext=getValue1()+getFlag()+getValue2();
        System.out.println(Calcultext);
        ScriptEngine jse = new ScriptEngineManager().getEngineByName("js");
        try{
            ActionContext actionContext = ActionContext.getContext();
            Map session = actionContext.getSession();

            String ans;
            ans=jse.eval(Calcultext).toString();
            System.out.println(ans);
            session.put("ans",ans);
            return "success";
        }catch (Exception e){
        }
        return "false";
    }
    public  static  void  main(String []args){
        CalculateAction a=new CalculateAction();
        a.setFlag("+");
        a.setValue1("1");
        a.setValue2("2");
        System.out.println(a.calculate());
    }
}

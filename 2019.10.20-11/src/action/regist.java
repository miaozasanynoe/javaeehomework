package action;
import vo.*;
import com.opensymphony.xwork2.ActionSupport;

public class regist extends ActionSupport {
    private registinf info;
    public registinf getInfo() {
        return info;
    }
    public void setInfo(registinf info) {
        this.info = info;
    }
    public String regist(){
        return SUCCESS;
    }
}

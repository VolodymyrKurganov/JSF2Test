package my.company;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ResourceBundle;

@ManagedBean
public class SampleBean {
    private String message;

    public String storeMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
        message = bundle.getString("hello.world");

        return "response";
    }

    public String getMessage() {
        return message;
    }
}
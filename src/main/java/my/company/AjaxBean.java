package my.company;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class AjaxBean {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increase() {
        counter++;
    }
}
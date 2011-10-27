package my.company.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

@SessionScoped
@ManagedBean
public class AjaxBean implements Serializable{
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increase() {
        counter++;
        int i = 0;
        i = counter / i;
    }

    public void increase(ActionEvent event) {
        increase();
    }

    public void showError(ActionEvent event) {
        increase();
    }

    public String showError() {
        increase();
        return "greeting";
    }
}
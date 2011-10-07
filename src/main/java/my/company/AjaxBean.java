package my.company;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
    }

    public void showError() {
        throw new RuntimeException("bubug");
    }
}
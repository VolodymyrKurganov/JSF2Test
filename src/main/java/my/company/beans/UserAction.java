package my.company.beans;


import my.company.storage.UserStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@RequestScoped
@ManagedBean
public class UserAction implements Serializable{
    private final static Logger log = LoggerFactory.getLogger(UserAction.class);

    private String action;

    @ManagedProperty(value="#{newUser}")
	private User user;

    @ManagedProperty(value="#{userStorage}")
	private UserStorage userStorage;


    @PostConstruct
    public void init(){
        log.debug("*********************");
        log.debug("UserAction.init");
        log.debug("user = " + user);
        log.debug("userStorage = " + userStorage);
        log.debug("*********************");
    }

    public String getAction() {
        log.debug("UserAction.getAction");
        return action;
    }

    public void setAction(String action) {
        log.debug("UserAction.setAction \"action\" = " + action);
        this.action = action;
    }

    public void setUser(User user) {
        log.debug("UserAction.setUser");
        this.user = user;
    }

    public void setUserStorage(UserStorage userStorage) {
        log.debug("UserAction.setUserStorage");
        this.userStorage = userStorage;
    }

    public void add(ActionEvent event) {
        log.debug("UserAction.add");
        userStorage.getUsers().add(user);
    }

    public void deleteByGet() {
        log.debug("UserAction.deleteByGet");
        log.debug("action = " + action);
        log.debug("user = " + user);
        if (null != action && action.equals("delete")) {
            userStorage.removeById(user.getId());
        }
    }

    public List<User> getUsers() {
        log.debug("UserAction.getUsers");
        return userStorage.getUsers();
    }
}

package my.company.storage;

import my.company.beans.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@SessionScoped
@ManagedBean
public class UserStorage implements Serializable {
    private final static Logger log = LoggerFactory.getLogger(UserStorage.class);

    private List<User> users = new LinkedList<User>();

    public List<User> getUsers() {
        log.debug("UserStorage.getUsers");
        return users;
    }

    @Override
    public String toString() {
        return "UserStorage{" +
                "users=" + users +
                '}';
    }

    public void removeById(int id) {
        log.debug("UserStorage.removeById 'id' = " + id);
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                break;
            }
        }
    }

    public static class Sequence {
        private int index;
        private static Sequence sequence = new Sequence();

        private Sequence() {
        }

        public static Sequence getInstance() {
            return sequence;
        }

        public int getNextIndex() {
            return index++;
        }
    }
}

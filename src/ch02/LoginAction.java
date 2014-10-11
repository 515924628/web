package ch02;

import ch01.User1;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by zpy on 14.10.10.
 */
public class LoginAction implements Action,ModelDriven<User1> {
	private User1 user = new User1();

	@Override
	public String execute() throws Exception {
		if ("asd".equals(user.getUsername()) && "123".equals(user.getPassword())){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	@Override
	public User1 getModel() {
		return user;
	}
}

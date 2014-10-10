package com.sg.zfw.web.action;

public class HelloWorld {
    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
	public String execute()
	{
		if(message.equals(""))
		{
			return "error";
		}
		else
		{
			return "ss";
		}
	}
  
    
}

package fileUpDown;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownload extends ActionSupport {

	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public InputStream getInputStream()
	{
		return ServletActionContext.getServletContext().getResourceAsStream(path);
	}
	
	@Override
	public String execute() throws Exception {
		
		
		return SUCCESS;
	}
	
}

package fileUpDown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class upLoad extends ActionSupport {
	private String title;
	private File upload;  
	// 上传的文件名
	private String uploadFileName;  
	// 获取在struts.xml中配置的文件保存路径
	private String savePath;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	/*savePath属性为struts.xml中配置的参数*/
	/*ServletActionContext非IOC方法获取Servlet*/
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	@Override
	public String execute() throws Exception {
		// 1. 已服务器的文件保存路径和原文件名建立上传文件输出流
		FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getUploadFileName());
		// 2. 定义输入流对象
		FileInputStream fis=new FileInputStream(getUpload());
		byte[] buffer=new byte[1024];
		int len=0;
		while((len=fis.read(buffer))>0){
			fos.write(buffer, 0, len);
		}
		fos.close();
		return SUCCESS;
	}
	
	
	
}

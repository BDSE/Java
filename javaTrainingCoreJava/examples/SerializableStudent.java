package examples;
/**
 * Student object created here, made serializable using the Serializable interface which is a marker interface
 */
import java.io.Serializable;

public class SerializableStudent implements Serializable{

	private static final long serialVersionUID = -3095034807443818547L;
	int studentId;
	String studentName;
	String major;
	transient String score;
	
	SerializableStudent(int s, String sn, String m, String sc){
		this.studentId = s;
		this.major = m;
		this.studentName = sn;
		this.score = sc;
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getScore() {
		return score;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
}

package examples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassExample {
public static void main(String args[]){
	Vector v = new Vector();
	v.addElement("aaa");
	v.addElement("bbb");
	v.addElement("ccc");
	v.addElement("ddd");
	
	Enumeration e = v.elements();
	while(e.hasMoreElements()){
		String str = (String)e.nextElement();
		System.out.println(str);
	}
}
}

  package MyLinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		MyLinkedList<String> myll = new MyLinkedList<String>();

		myll.addHeadElement("amar");
		myll.addHeadElement("cheekoo");
		myll.addHeadElement("orange");
		myll.addHeadElement("ammu");
		myll.addHeadElement("ammi");

		System.out.println(myll);
		System.out.println(myll.length());
		System.out.println(myll.get(4));

		myll.deleteHeadNode();

		System.out.println(myll);
		System.out.println(myll.length());
		System.out.println(myll.get(1));
		
		DoubleEndedLinkedList<String> delist = new DoubleEndedLinkedList<String>();
		
		delist.addElementAtEnd("ammi");
		delist.addElementAtEnd("cheekoo");
		delist.addElementAtEnd("orange");
		delist.addElementAtEnd("minni");
		delist.addElementAtEnd("laddu");
		
		System.out.println(delist.toString());
		
		SortedLinkedList<String> sList = new SortedLinkedList<String>();
		
		sList.addElement("zamar");
		sList.addElement("orange");
		sList.addElement("cheekoo");
		sList.addElement("bobo");
		sList.addElement("mango");
		
		System.out.println(sList.toString());
		
		DoubleLinkedList<String> dList = new DoubleLinkedList<String>();
		
		dList.addElementAtHead("232");
		dList.addElementAtHead("22");
		dList.addElementAtHead("3442");
		dList.addElementAtHead("2");
		dList.addElementAtHead("245");
		
		System.out.println(dList.toString());

	}

}

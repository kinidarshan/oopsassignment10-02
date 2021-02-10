package oopsassignment;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	  void DisplayBook() 
	  { 
		  System.out.println(bookNo); 
		  System.out.println(title); 
		  System.out.println(author); 
		  System.out.println(price); 

	 }
	
}

class EngineeringBook extends Book
{
	private String category;
	public EngineeringBook(int bookNo, String title, String author, float price) {
		super(bookNo, title, author, price);
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}



public class encapsulation_inheritance {

	public static void main(String[] args) {
		 EngineeringBook eb = new EngineeringBook(10238,"hii hello","Mr harsha",8900);
		  eb.setCategory("science");
		  
		  eb.DisplayBook();
		  System.out.println(eb.getCategory());
	}

}

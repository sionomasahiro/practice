public class Book extends TangibleAsset{
	private String isbn;

	public Book (String name,int price,String color,String isbn){
		super (name,price,color);
		this.isbm = isbn ;
	}

	public String getlsbn (){return this.isbn;}
}
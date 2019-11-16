package ua.lviv.lgs.min;

public class Books {
	
	
	@BookAnotation("Names_Book_text_ok")
	private String Name_Book;
	@BookAnotation("Names Autor Books__choice_ok")
	private String Name_Autor_Book;
	@BookAnotation("Many pages")
	private int Number_of_pages;
	
	public Books(String name_Book, String name_Autor_Book, int number_of_pages) {
		super();
		Name_Book = name_Book;
		Name_Autor_Book = name_Autor_Book;
		Number_of_pages = number_of_pages;
	}

	public String getName_Book() {
		return Name_Book;
	}

	public void setName_Book(String name_Book) {
		Name_Book = name_Book;
	}

	public String getName_Autor_Book() {
		return Name_Autor_Book;
	}

	public void setName_Autor_Book(String name_Autor_Book) {
		Name_Autor_Book = name_Autor_Book;
	}

	public int getNumber_of_pages() {
		return Number_of_pages;
	}

	public void setNumber_of_pages(int number_of_pages) {
		Number_of_pages = number_of_pages;
	}

	@Override
	public String toString() {
		return "Books [Name_Book=" + Name_Book + ", Name_Autor_Book=" + Name_Autor_Book + ", Number_of_pages="
				+ Number_of_pages + "]";
	}
	
	

}

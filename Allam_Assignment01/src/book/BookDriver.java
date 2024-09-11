package book;

//@author  Tejaswi Allam

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creation of book1 instance
        Book book1 = new Book();
        // Creation of book2 instance
        Book book2 = new Book();
        
        //setting data of book1
        book1.setTitle("The Catcher in the Rye");
        book1.setAuthor("J.D. Salinger");
        book1.setNbpages(224);
        
        //setting data of book2
        book2.setTitle("To Kill a Mockingbird");
        book2.setAuthor("Harper Lee");
        book2.setNbpages(346);
        
        //print book1 and book2 details
        System.out.println("Book 1:" + book1);
        System.out.println("\nBook 2:" + book2);
        
	}

}

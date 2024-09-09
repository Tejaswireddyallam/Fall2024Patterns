package book;

//@author  Tejaswi Allam

public class Book {
	
private String title;
private String author;
private int nbpages;

public Book(String title, String author, int nbpages) {
	this.title = title;
	this.author = author;
	this.nbpages = nbpages;
}


public Book() {
	title = "unknown";
	author = "unknown";
	nbpages = 0;
}


public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public int getNbpages() {
	return nbpages;
}


public void setNbpages(int nbpages) {
	this.nbpages = nbpages;
}


@Override
public String toString() {
	return String.format("\nTitle : %s \nAuthor: %s \nNumber of Pages: %d",this.getTitle(),this.getAuthor(),this.getNbpages());
}





}

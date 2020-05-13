package se.lexicon.bookstore;

public abstract class Book {

    private String title;
    private String author;
    private String category;
    private int pages;

    public Book(String title, String author, String category, int pages) {
        setTitle(title);
        setAuthor(author);
        setCategory(category);
        pages =100;
        setPages(pages);
    }

//    public Book(String title, String author, String category, int pages){
  //      this(title, author, category, pages);
 //   }


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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

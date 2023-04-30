import java.util.Date;
import java.util.*;

class Student {
    private String name;
    private int rollNumber;
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getPublisher() {
        return publisher;
    }
}

class BookIssue extends Student {
    private Book book;
    private Date issueDate;
    private Date returnDate;
    
    public BookIssue(String name, int rollNumber, Book book, Date issueDate) {
        super(name, rollNumber);
        this.book = book;
        this.issueDate = issueDate;
    }
    
    public Book getBook() {
        return book;
    }
    
    public Date getIssueDate() {
        return issueDate;
    }
    
    public Date getReturnDate() {
        return returnDate;
    }
    
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    public double calculateFine() {
        if (returnDate == null) { // book hasn't been returned yet
            return 0.0;
        }
        
        long daysLate = (returnDate.getTime() - issueDate.getTime()) / (24 * 60 * 60 * 1000); // calculate number of days late
        
        if (daysLate <= 0) { // book returned on or before due date
            return 0.0;
        } else {
            double finePerDay = 1.0; // assume fine of $1 per day late
            return finePerDay * daysLate;
        }
    }
}

public class BookIssueDemo {
    public static void main(String[] args) {
        Student student = new Student("Siddhartha ", 1390114);
        Book book = new Book("Introduction To Java", "CodeNinja", "Java World ");
        Date issueDate = new Date(); // use current date/time for issue date
        
        BookIssue bookIssue = new BookIssue(student.getName(), student.getRollNumber(), book, issueDate);
        
        // simulate book being returned
        Date returnDate = new Date(issueDate.getTime() + (9 * 24 * 60 * 60 * 1000)); // due date is 7 days from issue date
        bookIssue.setReturnDate(returnDate);
        
        // display book issue details and fine
        System.out.println("Book issued to: " + bookIssue.getName() + " (Roll No. " + bookIssue.getRollNumber() + ")");
        System.out.println("Title: " + bookIssue.getBook().getTitle());
        System.out.println("Author: " + bookIssue.getBook().getAuthor());
        System.out.println("Publisher: " + bookIssue.getBook().getPublisher());
        System.out.println("Issue Date: " + bookIssue.getIssueDate());
        System.out.println("return Date: " + bookIssue.getReturnDate());
        System.out.println("total fine: " + bookIssue.calculateFine());



    }
}
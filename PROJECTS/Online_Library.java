// package PROJECTS;

// class Library {

// String[] books;
// int no_of_books;

// Library() {
// this.books = new String[100];
// this.no_of_books = 0;
// }

// void addBook(String book) {
// this.books[no_of_books] = book;
// no_of_books++;
// System.out.println(book + " has been added");
// }

// // void issueBook(String book) {
// // for (int i = 0; i < this.books.length; i++) {
// // if (this.books[i].equals(book)) {
// // System.out.println("The book has been issued!");
// // this.books[i] = null;
// // return;
// // }
// // }
// // System.out.println("This book does not exist!");
// // }

// void returnBook() {

// }

// void showAvailableBook() {
// System.out.println("Available books are: ");
// for (int i = 0; i < this.books.length; i++) {
// if (books[i] == null)
// continue;

// System.out.println("* " + books[i]);
// }
// }

// }

// public class Online_Library {
// public static void main(String[] args) {
// Library centrLibrary = new Library();
// centrLibrary.addBook("Think and grow Rich");
// centrLibrary.addBook("Algorithms");
// centrLibrary.addBook("Java");
// centrLibrary.addBook("c");
// centrLibrary.addBook("c++");
// centrLibrary.addBook("DSA");

// centrLibrary.showAvailableBook();
// // centrLibrary.issueBook("c");
// // centrLibrary.issueBook("c++");
// centrLibrary.showAvailableBook();
// }

// }

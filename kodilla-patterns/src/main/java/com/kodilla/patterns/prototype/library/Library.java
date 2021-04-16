package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library>{


    private String name;
    private Set<Book> books = new HashSet<>();


    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public  Library deppCopy() throws CloneNotSupportedException{
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book : books){
            Book clonedBok = new Book(book.getTitle(),book.author,book.publicationDate);
        cloneLibrary.getBooks().add(clonedBok);
        }
        return cloneLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(getName(), library.getName()) && Objects.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBooks());
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

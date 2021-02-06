package book;

import java.util.*;

public class Book implements Comparable<Book>{
    private String title;
    private Integer year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        }
        else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }
    public String getTitle() {
        return this.title;
    }
    public List<String> getAuthors() {
        return this.authors;
    }
    public Integer getYear () {
        return this.year;
    }

    @Override
    public int compareTo(Book o) {
        if (this.title.equals(o.title)) {
            return this.year.compareTo(o.year);
        }
            return this.title.compareTo(o.title);
    }
}
package dao;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS", schema = "USER_NAME")
public class BooksEntity {
    private long boorId;
    private String bookTitle;
    private String bookDescription;
    private String boolAuthor;
    private String bookIsbn;
    private Long bookPrintyear;
    private String bookReadalready;

    @Override   
    public String toString() {
        return "BooksEntity{" +
                "boorId=" + boorId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", boolAuthor='" + boolAuthor + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookPrintyear=" + bookPrintyear +
                ", bookReadalready='" + bookReadalready + '\'' +
                '}';
    }

    public BooksEntity() {
    }

    public BooksEntity(long boorId, String bookTitle, String bookDescription, String boolAuthor, String bookIsbn, Long bookPrintyear, String bookReadalready) {

        this.boorId = boorId;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.boolAuthor = boolAuthor;
        this.bookIsbn = bookIsbn;
        this.bookPrintyear = bookPrintyear;
        this.bookReadalready = bookReadalready;
    }

    @Id
    @Column(name = "BOOR_ID", nullable = false, precision = 0)
    public long getBoorId() {
        return boorId;
    }

    public void setBoorId(long boorId) {
        this.boorId = boorId;
    }

    @Basic
    @Column(name = "BOOK_TITLE", nullable = true, length = 100)
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Basic
    @Column(name = "BOOK_DESCRIPTION", nullable = true, length = 255)
    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Basic
    @Column(name = "BOOL_AUTHOR", nullable = true, length = 100)
    public String getBoolAuthor() {
        return boolAuthor;
    }

    public void setBoolAuthor(String boolAuthor) {
        this.boolAuthor = boolAuthor;
    }

    @Basic
    @Column(name = "BOOK_ISBN", nullable = true, length = 20)
    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    @Basic
    @Column(name = "BOOK_PRINTYEAR", nullable = true, precision = 0)
    public Long getBookPrintyear() {
        return bookPrintyear;
    }

    public void setBookPrintyear(Long bookPrintyear) {
        this.bookPrintyear = bookPrintyear;
    }

    @Basic
    @Column(name = "BOOK_READALREADY", nullable = false, length = 1)
    public String getBookReadalready() {
        return bookReadalready;
    }

    public void setBookReadalready(String bookReadalready) {
        this.bookReadalready = bookReadalready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksEntity that = (BooksEntity) o;

        if (boorId != that.boorId) return false;
        if (bookTitle != null ? !bookTitle.equals(that.bookTitle) : that.bookTitle != null) return false;
        if (bookDescription != null ? !bookDescription.equals(that.bookDescription) : that.bookDescription != null)
            return false;
        if (boolAuthor != null ? !boolAuthor.equals(that.boolAuthor) : that.boolAuthor != null) return false;
        if (bookIsbn != null ? !bookIsbn.equals(that.bookIsbn) : that.bookIsbn != null) return false;
        if (bookPrintyear != null ? !bookPrintyear.equals(that.bookPrintyear) : that.bookPrintyear != null)
            return false;
        if (bookReadalready != null ? !bookReadalready.equals(that.bookReadalready) : that.bookReadalready != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (boorId ^ (boorId >>> 32));
        result = 31 * result + (bookTitle != null ? bookTitle.hashCode() : 0);
        result = 31 * result + (bookDescription != null ? bookDescription.hashCode() : 0);
        result = 31 * result + (boolAuthor != null ? boolAuthor.hashCode() : 0);
        result = 31 * result + (bookIsbn != null ? bookIsbn.hashCode() : 0);
        result = 31 * result + (bookPrintyear != null ? bookPrintyear.hashCode() : 0);
        result = 31 * result + (bookReadalready != null ? bookReadalready.hashCode() : 0);
        return result;
    }
}

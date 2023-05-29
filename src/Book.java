public class Book implements Comparable<Book>{

    String name;
    int pageNum;
    String authorName;
    int publishYear;

    public Book(String name, int pageNum, String authorName, int publishYear) {
        this.name = name;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    @Override
    public int compareTo(Book o) {
        //return this.name.compareTo(o.name);
        if(pageNum<o.pageNum) {return -1;}
        else if(pageNum>o.pageNum) {return 1;}
        else {return 0;}
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

   
}

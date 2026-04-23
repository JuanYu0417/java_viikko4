package viikko4.lab;

public class Book {
    private String name;
    private String author;
    private int year;
    public Book(String name, String author,int year){
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if(author==null||author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        if(year<0){
            throw new IllegalArgumentException("Year cannot be negative.");
        }
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public String getInfo(){
        return author+": "+name+" ("+year+")";
    }

}

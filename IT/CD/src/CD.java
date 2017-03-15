/**
 * Created by Francesco on 14/03/2017.
 */
public class CD {
    private String author, title, company, owner;

    /**
     * Creates a new CD instance and sets the author, the title, the company and the owner
     * @param author The CD's author or composer
     * @param title The CD's title
     * @param company The CD's company
     * @param owner The CD's owner
     */
    public CD(String author, String title, String company, String owner){
        this.author= author;
        this.title= title;
        this.company= company;
        this.owner= owner;
    }

    public CD(String author, String title, String company){
        this(author, title, company, "");
    }

    public CD makeCD(String author, String title, String company){
        CD out= new CD(author, title, company);
        return out;
    }

    public String[] printCD(){
        String[] out= {author, title, company};
        return out;
    }

    public void setOwner(String owner){
        this.owner= owner;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getCompany(){
        return company;
    }
    public String getOwner(){
        return owner;
    }

}

/**
 * Created by Francesco on 14/03/2017.
 */

/**
 * Class to manage a CD with an author, a title, a company and an owner
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

    /**
     * Creates a new CD instance and sets the author, the title and the company
     * @param author The CD's author or composer
     * @param title The CD's title
     * @param company The CD's company
     */
    public CD(String author, String title, String company){
        this(author, title, company, "");
    }

    /**
     * Creates a new CD with the given author, title and company
     * @param author The CD's author or composer
     * @param title The CD's title
     * @param company The CD's company
     * @return The created CD
     */
    public CD makeCD(String author, String title, String company){
        CD out= new CD(author, title, company);
        return out;
    }

    /**
     * Prints the CD information
     * @return A String array with 3 elements: author, title amd company
     */
    public String[] printCD(){
        String[] out= {author, title, company};
        return out;
    }

    /**
     * Sets the CD owner
     * @param owner The owner
     */
    public void setOwner(String owner){
        this.owner= owner;
    }

    /**
     * Gets the CD author
     * @return The author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Gets the CD title
     * @return The title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Gets the CD company
     * @return the company
     */
    public String getCompany(){
        return company;
    }

    /**
     * Gets the CD owner
     * @return The owner
     */
    public String getOwner(){
        return owner;
    }

}

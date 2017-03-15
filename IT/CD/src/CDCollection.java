import java.util.ArrayList;

/**
 * Created by Francesco on 15/03/2017.
 */

/**
 * Class to manage a CD collection using "CD" class
 */
public class CDCollection {
    CD[] collection = new CD[0];

    /**
     * Adds a new CD to the collection
     * @param author  The CD's author or composer
     * @param title   The CD's title
     * @param company The CD's company
     */
    public void addCD(String author, String title, String company) {
        CD[] newEntry = new CD[collection.length + 1];
        CD added = new CD(author, title, company);
        for (int i = 0; i < collection.length; i++)
            newEntry[i] = collection[i];
        newEntry[newEntry.length-1] = added;
        collection= newEntry;
    }

    /**
     * Removes a given CD form the collection
     * @param num The ID of the CD you want to remove
     */
    public void removeCD(int num) {
        if (num < collection.length && num >= 0) {
            CD[] removed = new CD[collection.length - 1];
            int j = 0;
            for (int i = 0; i < collection.length; i++)
                if (i != num) {
                    removed[j] = collection[i];
                    j++;
                }
            collection= removed;
        }

    }

    public String[] printCollection(){
        String[] out= new String[collection.length];
        for(int i = 0; i < collection.length; i++) {
            out[i] = "";
            out[i] += i + " | " + collection[i].printCD();
        }
        return out;
    }
    /**
     * Searches for a given author name on the collection
     * @param author The author's name to search for
     * @return An array with CDs that matches the given author
     */
    public CD[] authorSearch(String author) {
        ArrayList<CD> out = new ArrayList<>();
        for (int i = 0; i < collection.length; i++)
            if (collection[i].getAuthor().equalsIgnoreCase(author))
                out.add(collection[i]);
        return out.toArray(new CD[out.size()]);
    }

    /**
     * Searches for a given title on the collection
     * @param title The title to search for
     * @return An array with CDs that matches the given title
     */
    public CD[] titleSearch(String title) {
        ArrayList<CD> out = new ArrayList<>();
        for (int i = 0; i < collection.length; i++)
            if (collection[i].getTitle().equalsIgnoreCase(title))
                out.add(collection[i]);
        return out.toArray(new CD[out.size()]);
    }

    /**
     * Searches for a given company on the collection
     * @param company The company name to search for
     * @return An array with CDs that matches the given company
     */
    public CD[] companySearch(String company) {
        ArrayList<CD> out = new ArrayList<>();
        for (int i = 0; i < collection.length; i++)
            if (collection[i].getCompany().equalsIgnoreCase(company))
                out.add(collection[i]);
        return out.toArray(new CD[out.size()]);
    }
}

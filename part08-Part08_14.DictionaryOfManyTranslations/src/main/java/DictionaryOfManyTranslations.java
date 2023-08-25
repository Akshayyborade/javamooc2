import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary ;
       public DictionaryOfManyTranslations(){
        dictionary = new HashMap<>();
    }
    public void add(String word, String translation){
        //put if word not present in dictionary
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        //fetch list add their translation in list
        this.dictionary.get(word).add(translation);

    }
    public ArrayList<String> translate(String word){
        // return a list of translations added for the word
        return dictionary.getOrDefault(word, new ArrayList<>());

    }
    public void remove(String word){
        //remove word from dictionary
        dictionary.remove(word);
    }
}
package elements;

import java.util.ArrayList;

public class Sentence extends LanguageElement {

    private ArrayList<Word> theSentence = new ArrayList<Word>();

    public Sentence(ArrayList<Word> theSentence){

        this.theSentence = theSentence;

    }

    public int getSentenceLength(){
        return this.theSentence.size();
    }

    public ArrayList<Word> cloneSentenceLength(){
        ArrayList<Word> ret = this.theSentence;
        return ret;
    }

    public Word getSentenceWord(int n){
        return this.theSentence.get(n);
    }


}

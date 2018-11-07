package elements;

/**
 * A simple Word class.
 * Only used in DictCreator class.
 * Help to store the Word spelling and its frequency
 */
public class Word extends LanguageElement {

	private String theWord;		// need to have some change here, maybe using Arraylist
	private int theFrequency;

	public Word(String theWord, int theFrequency){

		this.theWord = theWord;
		this.theFrequency = theFrequency;

	}

	public String getWord(){
		return theWord;
	}

	public int getFrequency(){
		return theFrequency;
	}

	public void increaseFrequency(){
		this.theFrequency += 1;
	}

	public void increaseFrequency(int n){
		this.theFrequency += n;
	}

}
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class dictCreator{

	ArrayList<simpleword> allWords = new ArrayList<simpleword>();
	Scanner scanner;

	private File outFile;
	private File printFile;

	public dictCreator(String fileName){

		this.outFile = new File(fileName);
		this.scanner = new Scanner(this.outFile);

	}

	public dictCreator(File fileName){

		this.outFile = fileName;
		this.scanner = new Scanner(this.outFile);

	}

	public void addNewWord(String word, int frequency){

		simpleword newword = new simpleword(word, frequency);
		this.allWords.add(newword);

	}

	public void increaseWordFrequency(simpleword theword){

		theword.increaseFrequency();

	}

	// use the quicksort algorithm
	public static void sortByFrequency(){



	}

	private static void qsort(int[] arr, int low, int high){



	}

	private static int partition(int[] arr, int low, int high){



	}

	private void change(int i, int j){

		simpleword temp = allWords.get(i);
		allWords.set(i, allWords.get(j));
		allWords.set(j, temp);

	}

	public void print(){



	}

}

		// int pointerI = 0;
		// int pointerJ = allWords.size() - 1;
		// simpleword temp = allWords.get(0);

		// while(pointerI != pointerJ){

		// 	while(allWords.get(pointerJ).getFrequency() < temp.getFrequency()
		// 		&&pointerI<pointerJ){
		// 		pointerJ--;
		// 	}
		// 	while(allWords.get(pointerI).getFrequency() > temp.getFrequency()
		// 		&&pointerI<pointerJ){
		// 		pointerI++;
		// 	}

		// 	if(pointerI<pointerJ){
		// 		change(pointerI, pointerJ);
		// 	}

		// }
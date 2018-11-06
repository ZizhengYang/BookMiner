package er;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import elements.simpleword;

public class dictCreator{

	ArrayList<simpleword> allWords = new ArrayList<simpleword>();
	Scanner scanner;

	private File outFile;
	private File printFile;

	/**
	 * Use the string type path of the file to create the dictCreator object
	 */
	public dictCreator(String fileName){

		this.outFile = new File(fileName);
		//this.scanner = new Scanner(this.outFile);

	}

	/**
	 * Use the File type variable of the file to create the dictCreator object
	 */
	public dictCreator(File fileName){

		this.outFile = fileName;
		//this.scanner = new Scanner(this.outFile);

	}

	public void addNewWord(String word, int frequency){

		simpleword newword = new simpleword(word, frequency);
		this.allWords.add(newword);

	}

	public void increaseWordFrequency(simpleword theword){

		theword.increaseFrequency();

	}

	// use the quicksort algorithm
	public static void sortByFrequency(ArrayList<simpleword> waitingForSort){

		qsort(waitingForSort, 0, waitingForSort.size()-1);

	}

	// part of the quicksort algorithm
	private static void qsort(ArrayList<simpleword> waitingForSort, int low, int high){

		if(low < high)
		{
			int pivot = partition(waitingForSort, low, high);
			qsort(waitingForSort, low, pivot-1);
			qsort(waitingForSort, pivot+1, high);
		}

	}

	// part of the quicksort algorithm
	private static int partition(ArrayList<simpleword> waitingForSort, int low, int high){

		simpleword pivot = waitingForSort.get(low);

		while(low < high) {

			while(low < high && waitingForSort.get(high).getFrequency() >= pivot.getFrequency()) {
				high--;
			}
			waitingForSort.set(low, waitingForSort.get(high));

			while(low < high && waitingForSort.get(high).getFrequency() <= pivot.getFrequency()) {
				low++;
			}
			waitingForSort.set(high, waitingForSort.get(low));

		}

		waitingForSort.set(low, pivot);

		return low;

	}

	//public ArrayList<simpleword> output(){
//
	//	return allWords;
//
	//}

	public simpleword[] output(){

		simpleword[] arrayAllWords = new simpleword[allWords.size()];

		for(int i = 0; i < arrayAllWords.length; i++) {

			arrayAllWords[i] = allWords.get(i);

		}

		return arrayAllWords;

	}

	public void output(File fileName){



	}

}
package er;

import java.io.File;
import java.util.ArrayList;

public class reader{

    private ArrayList<File> searchResult;
    private final String rootDirInput;
    private final String nameInput;
    private final String absDirInput;


    public reader(ArrayList<File> dateFolders, String rootDirInput, String nameInput) {
        this.searchResult = dateFolders;
        this.rootDirInput = rootDirInput;
        this.nameInput = nameInput;
    }


    public ArrayList<File> getSearchResult() {
        File rootdir = new File(rootDirInput);
         File[] folderList = rootdir.listFiles();
        for (File folder : folderList) {
            if (folder.isDirectory()) {
                searchResult.add(folder);
            }
        }
        return searchResult;
    }

}
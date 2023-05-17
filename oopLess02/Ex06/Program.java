package Ex06;

import Ex06.Applications.Notepad;
import Ex06.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.currentDocument().addAllText("234fdf");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
        notes.SaveAs("fisle4", new Txt());



    }
}

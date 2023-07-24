package Ex06.Format;

import Ex06.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class PDF extends TextFormat{
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".pdf", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

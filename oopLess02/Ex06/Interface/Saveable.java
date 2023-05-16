package Ex06.Interface;

import Ex06.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

public class Document implements Printable {
    public String fileName;
    public String content;

    @Override 
    public String getPrintableContent() {
        return content;
    }
}

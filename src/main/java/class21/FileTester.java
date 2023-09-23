package class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr={new JavaFile("Javafile.java",1000),new WordFile("Word.doc",1000),new PdfFile("new.pdf",200)};
        for(File r:arr){
            r.open();
            r.edit();
            r.close();
        }
    }
}

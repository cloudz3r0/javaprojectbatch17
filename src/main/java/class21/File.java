package class21;

public abstract class File {
    /*
    Create a file class that will have the following behaviors:open,edit,and close.
    and fields like name and size. Edit and close are implemented method will open is
    abstract. Create 3 subclasses: JavaFile,WordFile,PdfFile that will provide specific
    implementation of open behaviour.
     */
    private String name;
    private int size;
public File(String name,int size){
    this.name=name;
    this.size=size;
}
public abstract void open();
public void edit(){
        System.out.println("Editing application "+name);
    }
   public void close(){
        System.out.println("Closing application "+name);
    }

}
class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening word file with microsoft word");
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening .java File using intellij");
    }
}
class PdfFile extends File{
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening .Pdf file with AdobePdfFile");


    }
}


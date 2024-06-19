import javax.print.Doc;

public class DocumentCharacter implements ILetter{

    private char character;
    private String fontType;
    private int size;

    DocumentCharacter(char character, String fontType, int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int row, int column) {
        // display the character of particular font and size
        // at given locaiton
        System.out.println("This " + this.character +" is at postion {" + row + ", " + column+ "}");
    }
}

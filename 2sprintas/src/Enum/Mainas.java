package Enum;

public class Mainas {
    public static void main(String[] args) {
        Spalvos spalva = Spalvos.BLUE;
        System.out.println(spalva.toString());
        if(spalva == Spalvos.RED) {
            System.out.println("Spalva raudona");
        } else if(spalva == Spalvos.GREEN) {
            System.out.println("Spalva zalia");
        } else if (spalva == Spalvos.BLUE) {
            System.out.println("Spalva melyna");
        }

    }
}

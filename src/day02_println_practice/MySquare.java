package day02_println_practice;

public class MySquare {
public static void main(String[] arcs){
    System.out.println(" ----");
    System.out.println("|    |");
            System.out.println(" ----");

    System.out.println("NESTED FOR EACH LOOP"); // malink it look lik e excel spreadsheet with columns and rows
            //NESTED FOR EACH LOOP

int [] rows = {1,2,3,4};
int [] cols = {1,2,3};
for (int row : rows) {
    for (int col : cols) {
        System.out.print(" |Row"+ row + "-Column " + col);
    }
    System.out.println();
}

    System.out.println("NESTED FOR LOOP");

//NESTED FOR LOOP
    for (int r=0; r<2; r++) {
        for (int k = 0; k<3; k++) {
            System.out.print(" |Row"+ r + "-Column " + k);
        }
        System.out.println();
    }



    int inputSeconds;
    int hours;
    int minutes;
    int seconds;
    inputSeconds = 3750;
    seconds= inputSeconds%60;
    minutes= (inputSeconds/60)%60;
    hours= inputSeconds/3600;

    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
}


}

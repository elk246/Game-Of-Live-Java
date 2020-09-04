public class Glider {

    private static boolean[][] Spielfeld = new boolean[20][20];
    private static boolean[][] Spielfeld2 = new boolean[20][20];


    private static void glider() {
        Spielfeld[3][4] = true;
        Spielfeld[4][5] = true;
        Spielfeld[4][6] = true;
        Spielfeld[3][6] = true;
        Spielfeld[5][5] = true;
    }

    private static void printSpielbrett1() throws InterruptedException {
        int alive=0;
        for(int row=0; row<Spielfeld2.length; row++){
            for(int column=0; column<Spielfeld2[row].length; column++){
                try{
                if(Spielfeld2[row][column+1]){
                    alive++;
                }else{
                }
            }


        }

    }


    public static void main(String[] args) throws InterruptedException {

        int a = 0;
        while (a ==0 ) {
            glider();
            printSpielbrett1();


        }
    }
}






















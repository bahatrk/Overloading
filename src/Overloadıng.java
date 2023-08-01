// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Overloadıng{

    public static void writeScore(String username, int score){
        System.out.print(username+"'s Score: "+score);
    }
    public static void writeScore(String username){
        System.out.print(username+"'s Score: 0");
    }
    public static void writeScore(int score){
        System.out.print("\nAnonymous User's Score: "+score);
    }
    public static void writeScore(){
        System.out.print("\nAnonymous User's Score: 0");
    }



    public static void main(String[] args){
        writeScore("\nBaha",100);
        writeScore("\nTaha");
        writeScore(80);
        writeScore();




        }
    }

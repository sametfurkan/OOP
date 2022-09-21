package run;
import java.util.Scanner;

public class Game {
    public static final int FULL_HEALTH = 100;

    private Player player1;
    private Player player2;
    public void StartStreetFighter(){
        do{
            buildPlayer1();buildPlayer2();
            startGame();
            resetAllHealths();
        }while (shouldContinue());

    }

    private void startGame() {
        while (player1.isAlive() && player2.isAlive()){
            System.out.println("Fighter " + player1.getCharacter() + " attack" );
            player2.decreaseHealth(getAttackPoint());
            System.out.println("Fighter " + player2.getCharacter() + " health:" + player2.getHealth());
            System.out.println("-------------------------------------");
            if(!player2.isAlive())
                break;

            System.out.println("Fighter " + player2.getCharacter() + " attack" );
            player1.decreaseHealth(getAttackPoint());
            System.out.println("Fighter " + player1.getCharacter() + " health:" + player1.getHealth());
            System.out.println("-------------------------------------");

        }

        System.out.println((player1.isAlive() ? player1.getCharacter() : player2.getCharacter()) + " WINNNN !");
        resetAllHealths();
    }

    private void buildPlayer1(){
        String nickname = askNickname();
        int age = askAge();
        player1 = new Player("Ryu", "Muat Thai", nickname, age);
    }
    private void buildPlayer2(){
        String nickname = askNickname();
        int age = askAge();
        player2 = new Player("Ken", "Hadouken", nickname, age);
    }

    private String askNickname(){
        System.out.println("Kullanıcıadınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int askAge(){
        System.out.println("Yaşınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getAttackPoint(){return (int) (1 + (Math.random() * 10));
    }

    private void resetAllHealths() {
        player1.resetHealth();
        player2.resetHealth();
    }

    private static boolean shouldContinue() {
        System.out.println("Tekrar oynamak ister misiniz ? (Evet/Hayır)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.trim().toLowerCase().equals("evet");
    }

}


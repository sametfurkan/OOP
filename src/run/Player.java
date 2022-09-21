package run;

import run.Game;

import java.util.Scanner;

public class Player extends GameElement{

    private String character;

    private String skills;
    private String nickname;
    private int age;





    public Player(String character, String skills, String nickname,int age ){
        setCharacter(character);
        setSkills(skills);
        setNickname(nickname);
        setAge(age);
    }
    public Player(String character){
        setCharacter(character);
        setNickname(nickname);
        setAge(age);
    }

    /*    SETTERS    */
    private void setCharacter(String character) {
        this.character = character;
    }



    private void setSkills(String skills) {
        this.skills = skills;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        if(age<8)
            throw new IllegalArgumentException("Yaşınız sekizden büyük olmalıdır !");
        this.age = age;
    }

    /*    GETTERS    */
    public String getCharacter() {  // name değişkenine erişim için kullanılan getter metodu.
        return character;
    }



    public String getSkills() { // health değişkenine erişim için kullanılan getter metodu.
        return skills;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }



    public String askNickname(){
        System.out.println("Kullanıcıadınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int askAge(){
        System.out.println("Yaşınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}

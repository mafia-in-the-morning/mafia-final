package mafia_42.main;
import mafia_42.game.AsciiArtPrinter;
import mafia_42.game.Game;
import mafia_42.game.Meeting;
import mafia_42.player.Doctor;
import mafia_42.player.Mafia;
import mafia_42.player.Police;

import java.util.*;
import java.lang.*;

import static mafia_42.game.Game.setPlayers;

public class Main {
    public static void main(String[] args) {
        //필요한 클래스 로드
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Game game = new Game();
        AsciiArtPrinter.startLogo();

        //참가자 인원 수 입력하기
        int numOfPlayers = game.setNumberOfPeople();

        // 참가자 이름 입력 받기
        ArrayList<String> players = setPlayers(numOfPlayers);
        ArrayList<String> deadPlayers = new ArrayList<>();
        ArrayList<String> citizenTeam = new ArrayList<>();
        ArrayList<String> mafiaTeam = new ArrayList<>();
    }
}

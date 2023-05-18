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

        // 최다 득표수를 얻은 참가자가 있을 경우 해당 참가자 제거 후 결과 출력
        if (!maxVotePlayer.equals("무효")) {
            System.out.println("\n" + maxVotePlayer + "님이 최다 득표수(" + maxVoteCount + "표)를 얻어 처형됩니다.");
            players.remove(maxVotePlayer);
            //마피아팀인 경우 마피아 리스트에서 삭제, 시민인 경우 시민 리스트에서 삭제
            if (mafiaTeam.contains(maxVotePlayer)) {
                mafiaTeam.remove(maxVotePlayer);
            } else {
                citizenTeam.remove(maxVotePlayer);
            }
            deadPlayers.add(maxVotePlayer);
            game.compareNumOfMafiaAndCitizen(mafiaTeam, citizenTeam);
        }else { // 무효 표시가 된 경우 결과 출력
            System.out.println("\n투표가 무효 처리되었습니다. 동점이거나 모든 참가자가 투표를 거부했습니다.");
        }
    }
}
    }
}

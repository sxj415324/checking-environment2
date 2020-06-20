/*package com.twschool.practice;

public class GuessNumberGame {
    public static final  int MAX_try_times = 6;
    private GuessNumber guessNumber;
    private  int leftTryTimes = MAX_try_times;
    private GameStatus gameStatus = GameStatus.CONTITNUE;

    public GuessNumberGame(GuessNumber guessNumber){
        this.guessNumber = guessNumber;
    }

    public String guess(String inputNumberString){
        String result = GuessNumber.check(inputNumberString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    public void modifyStatus(String result){
        if("4A0B".equals(result)){
            gameStatus = GameStatus.SUCCEED;
        }else if (leftTryTimes == 0){
            gameStatus = GameStatus.FAILED;
        }
    }

    private void decreaseTryTimes(){
        leftTryTimes --;
    }

    public GameStatus GameStatus() {

        return gameStatus;
    }

}
*/
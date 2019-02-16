import java.util.ArrayList;

class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();
        DotCom dot3 = new DotCom();

        dot1.setName('a.com');
        dot2.setName('b.com');
        dot3.setName("c.com");

        dotComsList.add(dot1);
        dotComsList.add(dot2);
        dotComsList.add(dot3);

        System.out.println("Your goal is to sink three dot coms.");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String guess = helper.getUserInput("Enter a guess");
            checkUserGuess(guess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotCom : dotComsList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("kill")) {
                dotComsList.remove(dotCom);
                break;
            }
            if (result.equlas("hit")) {
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] locations) {     
        locationCells = locations;
    }

    public String checkYourself(String stringGuess) {

        String result = "miss";
        int guess = Integer.parseInt(stringGuess);

        for (int cell : locationCells) {
            if (cell == guess) {
                numOfHits++;
                result = "hit";
                
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
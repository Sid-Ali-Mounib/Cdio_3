import java.util.ArrayList;


public class CardGameInstance {

    public void startGame(){

        ArrayList<Card> visibleCard = new ArrayList<Card>();
        ArrayList<String> stringCards = new ArrayList<String>();
        CardSolver Solver = new CardSolver();

    stringCards.add("Hearts 6");
    stringCards.add("Spades 10");
    stringCards.add("Clubs 4");
    stringCards.add("Diamonds 3");
    stringCards.add("Spades 4");
    stringCards.add("Diamonds 5");
    stringCards.add("Hearts 9");
    stringCards.add("Hearts 7");


    for (int i = 0; i < stringCards.size() ; i++) {

        String[] words = stringCards.get(i).split(" ");
        boolean red;
        if(words[0].equals("Hearts") || words[0].equals("Diamonds")){
            red = true;
        }else {
            red = false;
        }



        Card cardIndex = new Card(words[0],findValueOfCard(words[1]),red);
        visibleCard.add(cardIndex);

    }


        System.out.println(Solver.solveGame(visibleCard));
}




    private int findValueOfCard(String card){
        return Integer.parseInt(card);
    }

}

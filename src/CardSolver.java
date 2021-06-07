import java.util.ArrayList;

public class CardSolver {




    public String solveGame(ArrayList<Card> visibleCard) {

        for (int i = 0; i < visibleCard.size() - 1; i++) {
            for (int j = 0; j < visibleCard.size() - 1; j++) {
                if (visibleCard.get(i).getCardValue() == visibleCard.get(j).getCardValue() - 1 && visibleCard.get(i).isCardRed() != visibleCard.get(j).isCardRed() ) {


                    if ( visibleCard.get(i).getCardValue() >  visibleCard.get(j).getCardValue()){
                        return visibleCard.get(j).getCard()+" is placed on "+visibleCard.get(i).getCard();
                    }else {
                        return visibleCard.get(i).getCard()+" is placed on "+visibleCard.get(j).getCard();

                    }
                }
            }
        }
        return null;
    }


    private void checkIfPlacable(ArrayList A){


    }



}

import java.util.ArrayList;

public class CardSolver {




    public ArrayList<Card>[] solveGame(ArrayList<Card>[] visibleCard) {

        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        for (int i = 0; i < visibleCard.length ; i++) {
            System.out.println(visibleCard[i].toString());
        }
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        for (int i = 0;i<visibleCard.length; i++) {

            for (int j = 0; j < visibleCard[i].size(); j++) {


                for (int k = 0; k < visibleCard.length; k++) {
                    try {

                        int movingCardFrom=visibleCard[i].get(j).getCardValue();
                        int movingCardTo=visibleCard[k].get(visibleCard[k].size()-1).getCardValue()-1;
                        boolean cardsHaveDifferentColor = visibleCard[i].get(j).isCardRed()!=visibleCard[k].get(visibleCard[k].size()-1).isCardRed();
                        boolean notOnTheSameRow = visibleCard[i]!=visibleCard[k];


                        if (movingCardFrom == movingCardTo && cardsHaveDifferentColor && notOnTheSameRow){

                            for (int l = j; l < visibleCard[i].size();) {

                                visibleCard[k].add(visibleCard[i].get(l));
                                visibleCard[i].remove(l);


                            }




                        }
                    }catch (Exception E){


                    }

                }

            }
        }

        return visibleCard;
    }


    private void checkIfPlacable(ArrayList A, Card card){



    }



}

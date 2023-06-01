import java.util.ArrayList;

public class Casino {
    ArrayList<Card> deck = new ArrayList<>();

    public static void main(String[] args) {
        Casino table = new Casino();
    }
    public Casino(){
        for (int x = 0; x < 4; x++){
            for (int y = 1; y < 14; y++){
                deck.add(new Card(x,y));
            }
        }

        shuffle();
        PrintDeck();
    }


    public void PrintDeck(){
        for (Card c : deck){
            c.printInfo();
        }
}


    public void shuffle(){

        for (int x = 0; x < 52; x++) {
            Card temp = deck.get(x);
            int r = (int) (Math.random() * 52);
            deck.set(0, deck.get(r));
            deck.set(r, temp);

        }

    }

}

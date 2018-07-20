import java.util.ArrayList;

public class FlashCardsFormatter {

    private int key;
    private ArrayList<String> rawFlashCardsSet;
    private FlashCardsSet flashCardsSet;

    FlashCardsFormatter(ArrayList<String> rawFlashCardsSet) {
        this.rawFlashCardsSet = rawFlashCardsSet;
        key = rawFlashCardsSet.size();
        this.flashCardsSet = new FlashCardsSet(key);
    }

    private FlashCardsSet formatRawFlashCardsSet() {
        try {
            for (int i = 0; i < key; i++) {
                String[] flashCard = rawFlashCardsSet.get(i).split(" @ ");
                flashCardsSet.add(i, flashCard[0], flashCard[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd w pliku wejściwoym");
        }
        return flashCardsSet;
    }

    public FlashCardsSet getFormattedFlashCardsSet() {
        return formatRawFlashCardsSet();
    }
}

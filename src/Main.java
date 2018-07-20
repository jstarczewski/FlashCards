public class Main {

    public static void main(String[] args) {
        String path = "";
        FlashCardsFormatter flashCardsFormatter = FlashCardsReader.readPlainFlashCards(args[0]);
        FlashCardsSet flashCardsSet = flashCardsFormatter.getFormattedFlashCardsSet();
        System.out.println(flashCardsSet.getRandomFlashCard().toString());

    }


}

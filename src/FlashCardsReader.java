import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardsReader {

    public static FlashCardsFormatter readPlainFlashCards(String path) {
        ArrayList<String> rawFlashCards = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String rawFishCard;
            while ((rawFishCard = bufferedReader.readLine()) != null) {
                rawFlashCards.add(rawFishCard);
            }
        } catch (IOException e) {
            System.err.println("Unable to read File");
        }
        return new FlashCardsFormatter(rawFlashCards);
    }


}

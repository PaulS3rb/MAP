import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileRepo fileRepo = new FileRepo();
        fileRepo.showNamesThatStartWithLetter();
        fileRepo.sortByName();
        }



    }



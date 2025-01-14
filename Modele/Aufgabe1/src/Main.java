import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileRepo fileRepo = new FileRepo();
        //fileRepo.showNamesThatStartWithLetter();
        fileRepo.sortByName();
        fileRepo.sortByHouse();
        }



    }



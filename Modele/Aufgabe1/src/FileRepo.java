import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileRepo {


    public List<Punkt> readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("punkte.txt"));
        List<Punkt> punkte=new ArrayList<Punkt>();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split("&");
            int id=Integer.parseInt(tokens[0]);
            String student=tokens[1];
            String house=tokens[2];
            String autoritat=tokens[3];
            int points=Integer.parseInt(tokens[4]);
            punkte.add(new Punkt(id,student,house,autoritat,points));
        }

        return punkte;

    }

    public List<Punkt> showNamesThatStartWithLetter() throws FileNotFoundException {
        String character=System.console().readLine();
        List<Punkt> punkte= this.readFromFile();
        List<Punkt> newPunkte= new ArrayList<>();

        for(Punkt punkt : punkte){
            if(punkt.name.startsWith(character.toString())) {
                newPunkte.add(punkt);
                System.out.println(punkt.name);
            }
        }
        return newPunkte;
    }

    public List<Punkt> sortByName() throws FileNotFoundException {
        List<Punkt> punkte= this.readFromFile();
        List<String> names = new ArrayList<>();
        for(Punkt punkt : punkte){
            names.add(punkt.name);
        }

        names.sort((n1,n2)->String.CASE_INSENSITIVE_ORDER.compare(n1,n2));
        for(String name : names){
            System.out.println(name);
        }
        return punkte;
    }

    public void printPunkte(List<Punkt> punkte)
    {
        for(Punkt punkt : punkte)
            System.out.println(punkt.toString());
    }

    public void writeToFile() throws IOException {
        FileWriter writer= new FileWriter("ergebnis.txt");
        writer.write("AAAAAAAA");

    }



}



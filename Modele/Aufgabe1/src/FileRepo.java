import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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


    public void sortByHouse() throws IOException {
        /*List<Punkt> punkte= this.readFromFile();
        int sumGryffindor=0, sumSlytherin=0, sumHufflepuff=0, sumRavenclaw=0;
        for(Punkt punkt : punkte){
            if(punkt.house.equals("Slytherin")){
                sumSlytherin+=punkt.points;
            }
            if(punkt.house.equals("Hufflepuff")){
                sumHufflepuff+=punkt.points;
            }
            if(punkt.house.equals("Ravenclaw")){
                sumRavenclaw+=punkt.points;
            }
            if(punkt.house.equals("Gryffindor")) {
                sumGryffindor += punkt.points;
            }
        }



        SortedMap<Integer, String> map= new TreeMap<>();
        map.put(sumSlytherin, "Slytherin");
        map.put(sumHufflepuff, "Hufflepuff");
        map.put(sumRavenclaw, "Ravenclaw");
        map.put(sumGryffindor, "Gryffindor");
        Map<String, Integer> result= new HashMap();

        while(!map.isEmpty()){
            System.out.println(map.lastKey());
            this.writeToFile(map.values().toString());
            map.remove(map.lastKey());
        }*/


        Map<String, Integer> housePoints = new HashMap<>();
        housePoints.put("Gryffindor", 120);
        housePoints.put("Slytherin", 200);
        housePoints.put("Ravenclaw", 150);
        housePoints.put("Hufflepuff", 100);

        // Sort the map by values in descending order
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(housePoints.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println("House points sorted in descending order:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void printPunkte(List<Punkt> punkte)
    {
        for(Punkt punkt : punkte)
            System.out.println(punkt.toString());
    }

    public void writeToFile(String substring) throws IOException {
        FileWriter writer= new FileWriter("ergebnis.txt");
        writer.write(substring);
        writer.close();

    }



}



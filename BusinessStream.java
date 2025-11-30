import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessStream {
    public static void main(String[] args) {
        Business business1 = new Business("North Face", "123 Main St", "555-1234");

        business1.addPerson(new Business.Person("John", "Doex", 30));
        business1.addPerson(new Business.Person("Jane", "Smith", 28));

        
        Business business2 = new Business("Levi", "69 Cock Street", "051-0457");

        business2.addPerson(new Business.Person("Rashid", "Alì", 55));
        business2.addPerson(new Business.Person("Carlo", "Stanghellini", 60));
        business2.addPerson(new Business.Person("Marco", "Saracino",20));

        Business business3 = new Business("Beretta","Coop di Cesena","777-7777");

        business3.addPerson(new Business.Person("Razvan", "Ojog Vasilas",20));
        business3.addPerson(new Business.Person("Andrew", "Motanu",22));
        business3.addPerson(new Business.Person("Silvio","Berlusconi", 110));
        business3.addPerson(new Business.Person("IZ", "Carabiniere", 33));

        List<Business> business = Arrays.asList(business1, business2, business3);

        String s = business
            .stream()
            .filter(b -> b.getName().startsWith("B"))
            .flatMap(b -> b.getPeople().stream())
            .sorted((p1, p2) -> (p1.getFirstName() + " " + p1.getLastName()).compareTo(p2.getFirstName() + " " + p2.getLastName()))
            .filter(e -> e.getAge() >= 30)
            .map(p -> p.getFirstName() + " " + p.getLastName() + " (" + p.getAge() + ")\n")
            .collect(Collectors.joining(""));

        System.out.println(s);
    }
}
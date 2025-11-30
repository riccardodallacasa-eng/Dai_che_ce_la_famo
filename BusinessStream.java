public class BusinessStream {
    public static void main(String[] args) {
        Business business = new Business("North Face", "123 Main St", "555-1234");

        business.addPerson(new Business.Person("John", "Doe", 30));
        business.addPerson(new Business.Person("Jane", "Smith", 28));

        System.out.println("Business: " + business.getName());
        System.out.println("Address: " + business.getAddress());
        System.out.println("Phone: " + business.getPhoneNumber());
        System.out.println("People:");
        for (Business.Person p : business.getPeople()) {
            System.out.println(" - " + p);
        }
    }
}
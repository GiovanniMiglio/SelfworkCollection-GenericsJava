package extra4;

public class Main {
    public static void main(String[] args) {
        Person mario = new Person("Mario", "Rossi", 23);
        Scatola<String> s1 = new Scatola<>("ciao");
        Scatola<Integer> s2 = new Scatola<>(42);
        Scatola<Person> s3 = new Scatola<>(mario);
        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s3.getData());
    }
}

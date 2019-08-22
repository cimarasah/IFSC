
public class Main{
    public static void main( String[] args ){
        Person person = PersonFactory.getPerson(PersonFactory.PERSON_A);
        person.run();

        person = PersonFactory.getPerson(PersonFactory.PERSON_B);
        person.run();

        person = PersonFactory.getPerson(PersonFactory.PERSON_C);
        person.run();
    }
}


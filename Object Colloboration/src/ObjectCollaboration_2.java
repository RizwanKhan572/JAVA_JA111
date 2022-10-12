
/* In this topic I will use some same common data in objects.*/

public class ObjectCollaboration_2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Rizwan";
        person.city = "Mumbai";
        person.zip = "454545";
        //System.out.println(person.city);

        Address address = new Address();
        address.city = "Delhi";
        address.zip = "909090";

        Office office = new Office();
        office.companyName="Tata";
        office.address = address;
        System.out.println(office.address.zip);
    }
}
     class Person {
        String name;
        String city;
        String zip;
    }

    class Address {
        String city;
        String zip;

    }
    class Office {
        String companyName;
        Address address;

    }




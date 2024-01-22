import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Дан лист Person. Необходимо определить, есть ли в данном листе повторяющиеся объекты.
         */
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Miko",16));
        personList.add(new Person("Raf",12));
        personList.add(new Person("Miko",16));

        System.out.println(HasDuplicates.hasDuplicates(personList));

        /*
        Дана строка с именами вида Jack,John,Nick,John.
        Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
        Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick
         */

        String names = "Jack,John,Nick,John";
        System.out.println(DeleteDuplicateNames.deleteDuplicateNames(names));

        /*
        Дано два списка с Person необходимо получить Set с персонами которые присутствуют и в том и в другом списке
        */

        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("Jack",20));
        personList1.add(new Person("Tom",10));
        personList1.add(new Person("Leo",27));
        personList1.add(new Person("Lena",19));

        List<Person> personList2 = new ArrayList<>();
        personList2.add(new Person("Tom",10));
        personList2.add(new Person("John",27));
        personList2.add(new Person("Raf",21));
        personList2.add(new Person("Lena",19));

        System.out.println(FindCommonPersons.findCommonPersons(personList1,personList2));


        List<User> users = new ArrayList<>();
        users.add(new User("Tom"));
        users.add(new User("John"));
        users.add(new User("Raf"));
        users.add(new User("Lena"));
        users.add(new User("Miko"));
        users.add(new User("Raf"));
        users.add(new User("Miko"));
        users.add(new User("Tom"));
        users.add(new User("John"));

        System.out.println(FindDuplicateUsers.findDuplicateUsers(users));

    }
}
class DeleteDuplicateNames{
    public static String deleteDuplicateNames(String names){
        String result = "";
        String[] split = names.split(",");
        Set<String> namesSet = new HashSet<>();
        for (String name : split){
            namesSet.add(name);
        }
        result = String.join(",",namesSet);
        return result;
    }
}
class FindCommonPersons{
    public static Set<Person> findCommonPersons(List<Person> personList1, List<Person> personList2){
        Set<Person> persons = new HashSet<>();
        for (Person person1 : personList1){
            for (Person person2 : personList2){
                if (person1.equals(person2)){
                    persons.add(person1);
                }
            }
        }
        return persons;
    }
}
class FindDuplicateUsers{
    public static Set<User> findDuplicateUsers(List<User> users){
        Set<User> users1 = new HashSet<>();
        Set<User> result = new HashSet<>();
        for (User user : users){
            if (!users1.add(user)){
                result.add(user);
            }
        }
        return result;
    }
}
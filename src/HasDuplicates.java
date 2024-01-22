import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasDuplicates {
    public static boolean hasDuplicates(List<Person> personList){
        Set<Person> uniquePersons = new HashSet<>();
        for (Person person : personList){
            if (!uniquePersons.add(person)){
                return true;
            }
        }
        return false;
    }
}

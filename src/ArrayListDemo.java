import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListDemo {

    public static void main(String[] args) {

        Map <Integer, Integer> maps = new HashMap<>();

        maps.put(1,9);
        maps.put(2,7);

//        maps.get(1);

        System.out.println(        maps.get(1));

        int arr [] =  new int [2];

        ArrayList<UserInfo> users = new ArrayList();

        users.add(new UserInfo("Abhinandan",12L,"admin","abhionl009@gmail.com","9005805189"));
        users.add(new UserInfo("Shikha",13L,"manager","shika@gmail.com","8081910022"));
        users.add(new UserInfo("Shivam",14L,"normal","shivam@hotmail.com","9891213300"));
        users.add(new UserInfo("Rahul",15L,"admin","rahul91@shine.com","9910102189"));


        System.out.println(users);

        Iterator<UserInfo> iterator = users.iterator();

        while(iterator.hasNext()){

            UserInfo userInfo = iterator.next();
            System.out.println(userInfo.getName() +" -- " + userInfo.getEmail() +" -- " + userInfo.getRole());

        }

    }
}

public class Main {
    public static void main(String[] args){
        BaseDirectory directory = new UserDirectory();

        var user = new User( "Werewolf", "Betrayer", (byte) 66);

        int index = directory.insert(user);
        var savedUser = directory.get(index);
        int stringIndex = directory.insert( "asdf");

        System.out.println(savedUser);


}
}


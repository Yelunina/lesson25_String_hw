package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmx.de", "123456Ira!");
        System.out.println(user);

        user.setPassword("3141592Ira@");
        System.out.println(user);
        user.setPassword("3141592Ira");
        System.out.println(user);
        user.setPassword("3141592ra@");
        System.out.println(user);
        user.setPassword("3141592I@");
        System.out.println(user);
        user.setPassword("aaaaaaIra@");
        System.out.println(user);
        user.setPassword("311Ira@");
        System.out.println(user);
    }
}
package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmx.de", ",hfvb5Рjhg!");
        System.out.println(user);

        user.setPassword("mshbc5Y@lk");
        System.out.println(user);

    }
}
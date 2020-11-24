package com.groupVirginia.project1Task4;

public class Registration {

        public String Email() {
            return email;
        }
        void Email(String email) {
            if (email.contains("Yahoo")) {
                this.email=email;
            } else {
                System.out.println("Email not valid");
            }
        }
        public String userName() {
            return username;
        }
        void userName(String username) {
            if ((username.length() > 6)) {
                this.username=username;
            } else {
                System.out.println("User name not valid");
            }
        }
        public String passWord() {
            return password;
        }
        void passWord(String password) {
            if ((password.length() > 6) && !password.contains(username)) {
                this.password=password;
            } else {
                System.out.println("Password not valid");
            }
        }
        String username;
        String password;
        String email;

        public static void main(String[] args){

            Registration regist = new Registration();
            regist.Email("syntax.virginia@yahoo.com");
            System.out.println(regist.Email());
            regist.userName("Virginia-Syntax");
            System.out.println(regist.userName());
            regist.passWord("12345abcd");
            System.out.println(regist.passWord());
        }
    }


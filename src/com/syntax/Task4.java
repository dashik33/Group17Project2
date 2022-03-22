package com.syntax;
public class Task4 {
    //Create Registration Class in which you would have variables as email, userName and password that
    //have an access scope only within its own class. After creating an object of the class user should be able to
    //call methods and in each method separately pass values to set users email, username and password.
    //Requirements: A.Valid email consider to be only yahoo
    //B.Valid userName and password cannot be empty and should be of length larger than 6 characters. Also,
    //valid password cannot contain userName
        public static void main(String[] args) {
            Registration obj = new Registration();
            obj.setEmail("hello@yahoo.com");
            obj.setUserName("fahitas");
            obj.setPassword("fahitas123");
            System.out.println(obj.getEmail()+" "+obj.getUserName()+" "+obj.getPassword());
        }
    }
    class Registration{
        private String email;
        private String userName;
        private String password;

        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public void setEmail(String email) {
            if(email.contains("@yahoo")){
                this.email = email;
            }else{
                System.out.println("Email is invalid");
            }
        }
        public void setUserName(String userName) {
            if(!userName.isEmpty() && userName.length()>6) {
                this.userName = userName;
            }else{
                System.out.println("Username has to be more than 6 characters");
            }
        }
        public void setPassword(String password) {
            if(!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
                this.password = password;
            }else{
                System.out.println("Password has to be more than 6 characters and cannot contain the User Name");
            }
        }
        }





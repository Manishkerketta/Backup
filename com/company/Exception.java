package com.company;

 class Except {

    public static void main(String[] args) {
//        try{
//            Class.forName("com.mysql.jdbm.Driver");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        try {
            int a = 10, b = 0, c = a / b;
        } catch (ArithmeticException ae) {

        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("ExceptionHandlingDone");
    }
}

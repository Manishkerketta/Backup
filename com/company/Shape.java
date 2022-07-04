package com.company;

 class mobile{
     mobile(int price,String specifications,String processors){
         this.price=price;
         this.specifications=specifications;
         this.processors=processors;
     }
    private int price;
   private String specifications;
   private String processors;
  // public void setPrice(int price){
     //  this.price=price;
   //}
   public int getPrice(){
       return price;
   }
   public void setSpecifications(String specs){
       this.specifications=specs;
   }
   public String getSpecifications(){
       return specifications;
   }
   public void setProcessors(String processors){
       this.processors=processors;
   }
   public String getProcessors(){
       return processors;
   }
}
class Company{
    public static void main(String[] args) {
        mobile android=new mobile(10000,"6mm Technology with good battery optimisation features","Snapdragon 720G");
//        android.setPrice(20000);
//        System.out.println(android.getPrice());
//        android.setProcessors("Snapdragon 720G");
//        System.out.println(android.getProcessors());
//        android.setSpecifications("6mm Technology with good battery optimisation features");
//        System.out.println(android.getSpecifications());

        System.out.println(android.getPrice());
    }
}

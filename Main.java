class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte[] daysDefaulted={9,12,17,18,23};
   
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   float payPerDay=50f,amountPaid=220f;

   // declare all the variables needed for your calculations
   float totalAmount=0f;
   byte amountOfDays=0;
   float temp=amountPaid;
   byte daysPaidFor=0;
   float leftToPay;
   float extra;

   // calculate and print total amount the debtor is to pay using for each loop
   for(byte i:daysDefaulted) {

     totalAmount=totalAmount+payPerDay;

     amountOfDays++;
   }
   System.out.println("the number of days is "+ amountOfDays);   
    System.out.println("the total amount to be paid is " + totalAmount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
   
   for(int b=0;b<amountOfDays;b++){
   if(temp>=payPerDay){
     temp=temp-payPerDay;
     daysPaidFor++;
   }

  else if(temp<payPerDay){
       break;
   }

 }

 for(int i=0;i<daysPaidFor;i++){
   System.out.println(daysDefaulted[i]);

 }

 if(amountPaid%payPerDay>0&&amountPaid<totalAmount){
   System.out.println("the day that was not completely paid for is day "+ daysDefaulted[daysPaidFor]+" and the amount left to complete it is "+(payPerDay-(amountPaid%payPerDay)));
 }

   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
    if(amountPaid<totalAmount){
      leftToPay=totalAmount-amountPaid;
      System.out.println("the amount left to pay is "+leftToPay);
    }
    
    else if(amountPaid>totalAmount){
      extra=amountPaid-totalAmount;
      System.out.println("the amount you are being owed is "+extra);
    }

    else if(amountPaid==totalAmount){
      System.out.println("you have paid the exact amount");
    }



















































   //kindly remove the statement below when you are done with the assignment
   
  }
}
package day12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter screen size 13.3, 15.0 or 17.3");
        double size = input.nextDouble();
        System.out.println("Enter CPU type i3, i5, or i7");
        String cpu= input.next().toLowerCase();
        System.out.println("Enter RAM size");
        double ram= input.nextDouble();
        System.out.println("Enter storage type SSD or HDD");
        String  storage= input.next().toUpperCase();
        System.out.println("screen resolution FULLHD or 4K");
        String resolution= input.next().toUpperCase();

        double sizePrice = 0;
        double cpuPrice= 0;
        double ramPrice = 0;
        double storagePrice =0;
        double resolutionPrice =0;


        if(size == 13.3){
            sizePrice=200;
        }else if(size == 15.0){
            sizePrice=300;
        }else if (size == 17.3){
            sizePrice=400;
        }else{

            System.out.println("enter valid size");
        }
        System.out.println(sizePrice);

        if(cpu.equals("i3")){
            cpuPrice= 150;
        }else if(cpu.equals("i5")){
            cpuPrice= 250;
        }else if (cpu.equals("i7")){
            cpuPrice=350;
        }else{

            System.out.println("enter valid cpu type");
        }
        System.out.println(cpuPrice );

        if(ram == 4){
            ramPrice=50;
        }else if(ram == 8){
            ramPrice=100;
        }else if (ram == 16){
            ramPrice=150;
        }else{

            System.out.println("enter valid ram size");
        }
        System.out.println(ramPrice);

        if(storage.equals("SSD")){
            storagePrice= 50;
        }else if(storage.equals("HDD")){
            storagePrice=100;
        }else{

            System.out.println("enter valid storage type");
        }
        System.out.println(storagePrice);

        if(resolution.equals("FULLHD")){
            resolutionPrice=100;
        }else if(resolution.equals("4K")){
            resolutionPrice=200;
        }else{

            System.out.println("enter valid resolution type");
        }

        System.out.println("Total laptop price");System.out.println(sizePrice+ramPrice+cpuPrice+resolutionPrice+storagePrice);



    }
}
/*
If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
 */
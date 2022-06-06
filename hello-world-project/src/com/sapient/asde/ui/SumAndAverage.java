package com.sapient.asde.ui;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0;
        try{
//            if(args.length==0){
//                throw new IllegalArgumentException("Enter commandline arguments");
//            }
            for(int i=0;i<args.length;i++){
                sum += Integer.parseInt(args[i]);
            }
            double average = (double)sum/args.length;
            System.out.println("Average Value: "+ average);
        }
//        catch(IllegalArgumentException e){
//          e.printStackTrace();
//        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

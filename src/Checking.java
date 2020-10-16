public class Checking {
    public void checkStr(String str){

       String [] chB = str.split(" ");

       try {

           if (chB.length != 3){
               throw new Exception("Error. There should be no more than 3 elements");
           }

           if (chB[1].equals("-") || chB[1].equals("+") || chB[1].equals("*") || chB[1].equals("/") ){

               if (chB[0].matches("\\d+") && chB[2].matches("\\d+")){
                   Arab arab = new Arab();
                   arab.calcArab(chB[0], chB[1], chB[2]);
               } else if((chB[0].matches("[ivxIVX]+")) && (chB[2].matches("[ivxIVX]+"))){
                   Roman roman = new Roman();
                   roman.calcRoman(chB[0], chB[1], chB[2]);
               } else {
                   throw new Exception("Error. Unacceptable characters");
               }
           }

       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }


    }
}

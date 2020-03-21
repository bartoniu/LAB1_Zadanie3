import java.util.*;

class Zadanie3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testedvalue = "";

        System.out.println("Wprowadz liczbe 3-cyfrowa (4-cyfrowa z minusem): ");
        testedvalue = scan.nextLine();

        try
        {
            isNumberValid(testedvalue);
        }
        catch(NumberFormatException e1)
        {
            e1.printStackTrace();
            return;
        }
        catch(StringIndexOutOfBoundsException e2)
        {
            e2.printStackTrace();
            return;
        }

        numbersToNamesConvert(testedvalue);
    }

    private static void isNumberValid(String tested) throws NumberFormatException, StringIndexOutOfBoundsException  {
        if(tested.length()==4)
        {
            if(tested.charAt(0)!='-')
            {
                throw new NumberFormatException();
            }

            Integer.parseInt(tested);
        }
        else if (tested.length()==3 && tested.charAt(0)!='-')
        {
            Integer.parseInt(tested);
        }
        else
        {
            throw new StringIndexOutOfBoundsException();
        }
    }

    private static void numbersToNamesConvert(String tested) {
        HashMap<Character, String> namesOfNumbers = new HashMap<Character, String>();

        namesOfNumbers.put('-', "minus");
        namesOfNumbers.put('1', "jeden");
        namesOfNumbers.put('2', "dwa");
        namesOfNumbers.put('3', "trzy");
        namesOfNumbers.put('4', "cztery");
        namesOfNumbers.put('5', "piec");
        namesOfNumbers.put('6', "szesc");
        namesOfNumbers.put('7', "siedem");
        namesOfNumbers.put('8', "osiem");
        namesOfNumbers.put('9', "dziewiec");

        for(int i = 0; i<tested.length(); i++)
        {
            System.out.print(namesOfNumbers.get(tested.charAt(i))+" ");
        }
    }
}
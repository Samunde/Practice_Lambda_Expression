import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LambdaExpressionPractice {
    public static void main(String[] args) {
//Use the three different types of lambda expressions with a forEach() or removeIf method.

        String[] name = { "Peter","John", "James","Simon","Bartholomew","Andrew","Jude","Matthew"};

        Integer[] numbers ={1,2,3,5,6,7,8,9,10};


        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

//      //  First type to iterate through the list

//        nameList.forEach(listOfNames-> System.out.println(listOfNames));
//        numList.forEach(listOfNumbers-> System.out.println(listOfNumbers));

        // Second type to iterate through the list

//        nameList.forEach(System.out::println);
//          numList.forEach(System.out::println);

        // Third type to iterate through the list// with curly parentheses

//        nameList.forEach(names ->{ System.out.println(names);});
//        numList.forEach(nums ->{ System.out.println(nums);});

        // Fourth method to iterate through the list with Enhance for loop
        for(String names:nameList){
            System.out.println(names);
        }
        for(Integer nums:numList){
            System.out.println(nums);
        }
        }
    }

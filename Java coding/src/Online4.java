import java.util.Scanner;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;

//1

/*
interface int1{
    //void show1();

    int show2(int num);
}
public class Online4 {
    public static void main(String[] args) {
        // lambda function
        
        // int1 ref = () -> System.out.println("Inside show method");
        // ref.show1();
        

        int1 ref2 = (int num) -> {
            return num;
        };
        System.out.println(ref2.show2(5));
    }
}
*/

// 2

/*
interface int1{
    int show(int x,int y,int z);
}

public class Online4 {
    public static void main(String[] args) {
        int1 ref = (int a,int b,int c) -> {
            return a+b+c;
        };
        System.out.println("Sum is: "+ref.show(2, 3, 4));
    }
}
*/


// DATE AND TIME

/* 
public class Online4 {
    public static void main(String[] args) {
        
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(f.format(d1));

        //immutable
        LocalDate d2 = LocalDate.parse("2024-04-03");
        System.out.println(d2);

        System.out.println("Is leap year: "+d2.isLeapYear());

        // isBefore   isAfter

        System.out.println(d1.getMonth());
        System.out.println(d1.getMonthValue());
        System.out.println(d2.getDayOfMonth());
        System.out.println(d2.getDayOfWeek());
        System.out.println(d2.lengthOfMonth());

        System.out.println(d1.getHour());
        System.out.println(d1.getMinute());
        System.out.println(d1.getSecond());
        System.out.println(d1.getNano());
        

        LocalDate d1 = LocalDate.of(2024,04,03);
        LocalDate d2 = LocalDate.of(2024,9,02);
        System.out.println(ChronoUnit.DAYS.between(d1, d2));

    }
}
*/


// 4
/*
public class Online4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            checkForVowel(str);
            System.out.println("String contains vowels.");
        } catch (NoVowelException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void checkForVowel(String str) throws NoVowelException {
        boolean foundVowel = false;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                foundVowel = true;
                break;
            }
        }
        if (!foundVowel) {
            throw new NoVowelException("String doesn't contain any vowels.");
        }
    }

    static class NoVowelException extends Exception {
        public NoVowelException(String message) {
            super(message);
        }
    }
}
*/


// 5

import java.util.Arrays;

public class Online4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        try {
            checkForDuplicates(numbers);
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

    static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
            }
        }
    }

    static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }
}


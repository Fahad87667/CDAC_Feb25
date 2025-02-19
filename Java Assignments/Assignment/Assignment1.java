// QUESTION 1

class helloworld {
    public static void main(String args[]) {
        System.out.println("Hello");
        System.out.println("Fahad Khan");
    }
}

// QUESTION 2

class summ {
    public static void main(String args[]) {
        int a = 74, b = 36;
        System.out.println(a + b);
    }
}

// QUESTION 3

class divide {
    public static void main(String args[]) {
        int a = 50, b = 3;
        System.out.println(a / b);
    }
}

// QUESTION 4

class arithmetic {
    public static void main(String args[]) {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}

// QUESTION 5

class multiply {
    public static void main(String args[]) {
        int a = 25, b = 5;
        System.out.println(a + " x " + b + " = " + (a * b));
    }
}

// QUESTION 6

class basicarithmetic {
    public static void main(String args[]) {
        int a = 125, b = 24;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
    }
}

// QUESTION 7

class table {
    public static void main(String args[]) {
        int a = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
        }
    }
}

// QUESTION 8

class swap {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("Before Swapping\nFirst Number: " + a + "\nSecond Number: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping\nFirst Number: " + a + "\nSecond Number: " + b);
    }
}

// QUESTION 9

class areaofcircle {
    public static void main(String args[]) {
        int radius = 7;
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

// QUESTION 10

class evenodd {
    public static void main(String args[]) {
        int num = 15;
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even.");
        } else {
            System.out.println("The number " + num + " is Odd.");
        }
    }
}


// QUESTION 11

class largestnumber {
    public static void main(String args[]) {
        int a = 12, b = 45, c = 22;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is " + largest);
    }
}

// QUESTION 12

class reversenumber {
    public static void main(String args[]) {
        int num = 12345, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of 12345 is " + reversed);
    }
}

// QUESTION 13

class average {
    public static void main(String args[]) {
        int a = 20, b = 40, c = 60;
        double avg = (a + b + c) / 3.0;
        System.out.println("The average is: " + avg);
    }
}

// QUESTION 14

class fibonacci {
    public static void main(String args[]) {
        int n = 10, a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

// QUESTION 15

class factorial {
    public static void main(String args[]) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}

// QUESTION 16

class primecheck {
    public static void main(String args[]) {
        int num = 17, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        if (count == 2) {
            System.out.println("The number " + num + " is Prime.");
        } else {
            System.out.println("The number " + num + " is not Prime.");
        }
    }
}

// QUESTION 17

class naturalnumbers {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

// QUESTION 18

class celsiustof {
    public static void main(String args[]) {
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}

// QUESTION 19

class power {
    public static void main(String args[]) {
        int base = 3, exponent = 4;
        int result = (int) Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}

// QUESTION 20

class digitcount {
    public static void main(String args[]) {
        int num = 123456, count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("The number 123456 has " + count + " digits.");
    }
}

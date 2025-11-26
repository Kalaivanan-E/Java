
// int[] prices={199,129,98,78,11,171,1055};

//2. Print only prices greater than 100.
class Test{
    public static void main(String[] args) {
       int[] prices={199,129,98,78,11,171,1055};
       for(int i =0; i< prices.length; i++){
        if(prices[i]>100){
            System.out.print(prices[i]);  // 199, 129, 171, 1055
        }
       } 
    }
}

// 3. Count how many prices are below 100.
class Testtwo{
    public static void main(String[] args) {
       int[] prices={199,129,98,78,11,171,1055};
       int count = 0;
       for(int price : prices){
            if(price<100){
                count++;
            }
       }
       System.out.println(count); // 3
       
    }
}

// 4. Find the first price greater than 500 using break.

class Testthree{
    public static void main(String[] args) {
       int[] prices={199,129,98,178,11,171,1055};
       
       for (int price : prices){
        if(price > 500){
            break;
        }
        else{
            System.out.println(price); // 199,129,98,178,11,171
        }
            
       }       
    }
}
// 5. Skip prices that are less than 50 using continue.

class Testfour{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int price : prices){
            if(price < 50){
                continue;
            }
            else{
                System.out.println(price);
            }
        }
    }
}

//6. Find the maximum price in the array.

class Testfive{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int largest = 0;
        for (int price : prices){
            if(largest<price){
                largest = price;
            }
        }
        System.out.println(largest);

    }
}

// 7. Find the minimum price in the array.

class Testsix{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int lowest = prices[0];
        for (int i=0; i< prices.length; i++){
            
            if(prices[i]<lowest){
                lowest = prices[i];
            }
        }
        System.out.println(lowest);
    }
}

// 8. Sum all prices in the array.

class Testeight{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int sum_of = 0;
        for (int price : prices){
            sum_of = sum_of + price;
        }
        System.out.println("The sum of all prices : " + sum_of);
    }
}

//9. Print prices located at even index positions.

class Testnine{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int i =0; i< prices.length; i++){
            if(i%2 == 0){
                System.out.println(prices[i]);
            }
        }
    }
}

//10. Print only odd-number prices.

class Testten{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int i =0; i< prices.length; i++){
            if(i%2 == 1){
                System.out.println(prices[i]);
            }
        }
    }
}
//11. Display 'High Price' if price > 200 else 'Low Price'

class Test11{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for(int price : prices){
            if(price> 200){
                System.out.println(price + " High Price ");
            }else{
                System.out.println(price + " Low price ");
            }
        }
    }
}

//13. Print prices until a value less than 50 appears (use break).

class Test12{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int price : prices){
            if (price < 50){
                break;
            }else{
                System.out.println(price);
            }
        }
    }
}

// 14. Print only the first 3 prices.

class Test13{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int i=0; i<prices.length; i++){
            if(i == 3){
                break;
            }else{
                System.out.println(prices[i]);
            }
        }
    }
}

//15. Reverse print the array without built-in functions.

class Test14{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int i = prices.length-1; i>=0; i--){
            System.out.println(prices[i]);
        }
    }
}

//16. Count how many prices are divisible by 3.

class Test15{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int  count = 0;
        for (int price : prices){
            if(price %3 == 0){
                count ++;
            }
        }
        System.out.println(count);

    }
}
// 17. Skip the highest price using continue.

class Test16{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int largest = 0;
        for (int price : prices){
            if(largest<price){
                largest = price;
            }
        }
        for(int price : prices){
            if(price == largest){
                continue;
            }
            System.out.println(price);
        }
    }
}
// 18. Print index and value of each price.

class Test17{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int i =0; i< prices.length; i++){
            System.out.println("Index of " + i + ",  Price of value is " + prices[i]);
        }
    }
}

// 19. Multiply each price by 10 and print results.

class Test18{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        for (int price : prices){
            int result = price * 10;
            System.out.println(result);
        }
    }
}

//20. Keep summing prices until sum exceeds 500 (use break).

class Test19{
    public static void main(String[] args) {
        int [] prices = {199,129,98,178,11,171,1055};
        int sum = 0;
        for ()
    }
}
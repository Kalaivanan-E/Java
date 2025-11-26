
// int[] prices={199,129,98,78,11,171,1055};

//2. Print only prices greater than 100.

class Test{
    public static void main(String[] args) {
       int[] prices={199,129,98,78,11,171,1055};
       for(int i =0; i< prices.length; i++){
        if(prices[i]>100){
            System.out.println(prices[i]);  // 199, 129, 171, 1055
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
       System.out.println(count);
       
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
            System.out.println(price);
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

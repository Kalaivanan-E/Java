
// int [] prices = {199,129,98,78,11,171,1055}
// iterate arrat prices & print all prices

// using for loop
class Test{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int i=0; i< prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}

// using while loop

class Testone{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int i = 0;
        while(i<prices.length){
            System.out.println(prices[i]);
            i++;
        }
    }
}

// using do while loop

class Testtwo{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int i =0;
        do{
            System.out.println(prices[i]);
            i++;
        }while(i<prices.length);
    }
}

// using for each

class Testthree{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int price : prices){
            System.out.println(price);
        }
        
    }
}

// iterate prices print all product below 400

class Testfour{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int i=0; i< prices.length; i++){
            if(prices[i]<400){
                System.out.println(prices[i]);
            }
        }
    }
}

// create new array based existing array?


class Testfive{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int [] prod_prices = new int[prices.length];
        for (int i =0; i< prices.length; i++){
            prod_prices[i] = prices[i]; 
            System.out.println(prod_prices[i]);
        }
    }
}
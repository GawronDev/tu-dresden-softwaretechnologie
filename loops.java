// Testing how do loops work. I already have a lot of expirience in javascript, so hopefully this will be familiar

class loops {
    public static void main(String[] args) {

        // Check how the for and while loops work in Java
        int to_loop = 5;
        int n = 0;
        while(to_loop >= n) {
            System.out.println(n);
            n++;
        }
        
        // Iteration over a for loop
        String[] cars = {"BMW", "Volvo", "Audi"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    } 
}

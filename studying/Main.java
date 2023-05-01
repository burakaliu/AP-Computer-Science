class Main{
    public static void main(String[] args) {

        //getting rtandom number between min and max = (int)(Math.random() * ((max - min) + 1));
        int min = 5;
        int max = 10;
        for (int i = 0; i < 10; i++){
            System.out.println((int)(Math.random() * (max - min + 1) + min));
        }

        //opeation stuff
        int a = 5;
        a = a - (int) 2.9;
        System.out.println(a);
        
    }
}
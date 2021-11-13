    public class Main {
        public static void main(String[] args) {
            Car tesla = new Car(250, "Tesla", "white", 45362718);
            Car porshe = new Car(320, "Porshe", "blue", 89706958);

            System.out.println(tesla.equals(porshe));
        }

    }

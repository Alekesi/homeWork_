    public class Car {

        private int maxSpeed;
        private String brandName;
        private String color;
        private long vinNumber;

        public Car(int maxSpeed, String brandName, String color, long vinNumber) {
            this.maxSpeed = maxSpeed;
            this.brandName = brandName;
            this.color = color;
            this.vinNumber = vinNumber;

        }


        public void getMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public String getBrandName() {
            return brandName;
        }


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public long getVinNumber() {
            return vinNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Car car = (Car) o;

            return maxSpeed == car.maxSpeed;
        }

        @Override
        public int hashCode() {
            return (int) (maxSpeed ^ (maxSpeed >>> 32));
        }
    }
}

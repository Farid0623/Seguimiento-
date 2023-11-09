package Filter;

public class Business {

        private String name;
        private int adress;

        public Business(String name,int adress) {
            this.name = name;
            this.adress = adress;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAdress() {
            return adress;
        }

        public void setAdress(int adress) {
            this.adress = adress;
        }

}

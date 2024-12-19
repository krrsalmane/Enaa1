import java.util.spi.AbstractResourceBundleProvider;

   abstract  class Person {
        private String firstname;
        private String lastname;
        private int ID;
        private String email;
        private int numtelph;
        public Person(){}

       public Person(String firstname, String lastname, int ID, String email, int numtelph) {
           this.firstname = firstname;
           this.lastname = lastname;
           this.ID = ID;
           this.email = email;
           this.numtelph = numtelph;
       }

       public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getNumtelph() {
            return numtelph;
        }

        public void setNumtelph(int numtelph) {
            this.numtelph = numtelph;
        }
    }





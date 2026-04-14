public class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name, String phoneNumber, String email){
        this.name = name; 
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

     public void setEmail(String email){
        this.email = email;
    }



    @Override
    public String toString(){
        return "Name:  " + name +
                ", Phone:  " + phoneNumber + 
                ", Email:  " + email;
    }
}

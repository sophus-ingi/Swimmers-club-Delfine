class ClubMember {
    private String name;
    private int age;
    private String membershipType;
    private int cprNumber;
    private int phoneNumber;
    private String email;
    private String address;
    private String gender;

    public ClubMember(String name, int age, String membershipType, int cprNumber, int phoneNumber, String email, String address) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.cprNumber = cprNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMembershipType() {
        return membershipType;
    }
    public int getCprNumber(){
        return cprNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender(){
        return gender;
    }

    //TODO add additional methods for member-related functionalities can be added here



 @Override
    public String toString() {
        return "domain.Superhero [" +
                "Name: " + name +
                ", Age: " + age +
                ", Membership: " + membershipType +
                ", Cpr Number: " + cprNumber +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email +
                ", Address: " + address +
                ", Gender: " + gender + "]";
    }
}



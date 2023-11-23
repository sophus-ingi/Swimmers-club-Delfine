class ClubMember {
    private String name;
    private int age;
    private String membershipType;
    private int cprNumber;
    private int phoneNumber;
    private String email;
    private String adress;

    public ClubMember(String name, int age, String membershipType, int cprNumber, int phoneNumber, String email, String adress) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.cprNumber = cprNumber;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.email = email;
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

    public String getAdress() {
        return adress;
    }

    //TODO add additional methods for member-related functionalities can be added here

}

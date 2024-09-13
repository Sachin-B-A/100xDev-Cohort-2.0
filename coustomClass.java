class Main{
    public static void main(String[] args) {
        Data data1 = new Data("1VA21Cd045" , "sachinba.20@gmail.com" , "keep it secret");
        data1.setName("Sachin");
        System.out.println(data1.getName());
    }
}

class InternalData{
    String InternalData;
    public void ReadInternalData(){
        System.out.println(InternalData);
    }
}

class Data{
    private String name;
    private Integer id;

    private String USN;
    private String email;

    private InternalData internal; // Using other class has a data type;

    Data(String USN, String email, String internal) {
        this.USN = USN;
        this.email = email;
        this.internal = internal
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getId(){
        return this.id;
    }
}


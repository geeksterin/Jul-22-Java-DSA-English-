class Device {

    String modelNo;

    String getModelNo() {
        System.out.println("fn call of Device.");
        return this.modelNo;
    }
    void setModelNoDevice(String modelNo) {
        this.modelNo = modelNo;
    }

}

class Phone extends Device {

    private String phoneNumber;
    String modelNo;

    Phone(String phoneNumber, String modelNo) {
        this.phoneNumber = phoneNumber;
        this.modelNo = modelNo;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }
    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    String getUniqueID() {
        // return this.modelNo+this.phoneNumber;
        return this.modelNo+this.phoneNumber;   
    }

    String getModelNo() {
        System.out.println("fn call of Phone.");
        return this.modelNo;
    }

}

public class SameAttributeInBothClasses {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Phone iphone = new Phone("9090909090","14Pro");
        
        System.out.println(iphone.modelNo);
        
        iphone.setModelNoDevice("15");

        System.out.println(iphone.modelNo);

        System.out.println("\n");

    }

}
package com.oops.association;
public class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information info;
    Payment pay;
    public Patient(String patientName, int patientAge, String doa, String disease,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("DOA: " + this.doa);
        System.out.println("Disease: " + this.doa);
        System.out.println("Block: " + this.info.blockNo);
        System.out.println("Floor: "+ this.info.floorNo);
        System.out.println("Room: " + this.info.roomNo);
        System.out.println("Bed: " + this.info.bedNo);
        System.out.println("Adm Fees: " + this.pay.admFee);
        System.out.println("Reg Fees: " + this.pay.regFees);
        System.out.println("Bal Amt: " + this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info1 = new Information('C', 4, 402, 3);
        Payment pay1 = new Payment(20000, 10000, 5000);
        Patient p1 = new Patient("XYZ", 21, "23/01/26", "Malaria",
                info1, pay1);
        p1.patientDetails();
    }

}

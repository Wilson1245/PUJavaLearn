public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
        System.out.println("patient");
    }
}

class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;
    void giveAdvice() {
        System.out.println("advice");
    }
}

class Surgeon extends Doctor {
    void treatPatient() {
        // 進行手術
    }

    void makeIncision() {
        // 切割手術
    }
}
package main.java.control_flow.assigment_problems;

public class VotingEligibilityChecker {
    void checkVotingEligibility(int age){
        if(age >=18) {
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
    }

    public static void main(String args[]){
        VotingEligibilityChecker obj = new VotingEligibilityChecker();
        obj.checkVotingEligibility(9);
    }

}

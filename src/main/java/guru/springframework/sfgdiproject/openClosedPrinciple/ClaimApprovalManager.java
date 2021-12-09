package guru.springframework.sfgdiproject.openClosedPrinciple;

public class ClaimApprovalManager {
    // NOTE: to ensure Open principle, the argument needs to be using the abstract class insteand of concrete class
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}

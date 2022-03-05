package guru.springframework.sfgdiproject.openClosedPrinciple;


/*
* The requirement is to implement HealthInsuranceSurveyor that validate Health insurance
*
* Remember: new Feature should always Extend interface / abstract class, NO modification should happen to the upper one
*
* */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}

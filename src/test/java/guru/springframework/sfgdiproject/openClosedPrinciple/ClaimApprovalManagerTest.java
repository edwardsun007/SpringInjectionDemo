package guru.springframework.sfgdiproject.openClosedPrinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() throws Exception {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();

        ClaimApprovalManager claim1 = new ClaimApprovalManager();

        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        ClaimApprovalManager claim2 = new ClaimApprovalManager();

        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}
package BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestRailHooks {

    private TestRail testRail = new TestRail();

    @Before
    public void beforeScenario(Scenario scenario) {
        // You can optionally create a test case in TestRail here, or log pre-test data
    }

    @After
    public void afterScenario(Scenario scenario) {
        String testStatus = scenario.isFailed() ? "failed" : "passed";
        String comment = "Test executed at " + System.currentTimeMillis() + ", " + scenario.getName();

        // Get the TestRail Case ID from the scenario tag (assuming it's tagged like @case_123)
        String caseId = getTestRailCaseId(scenario);
        if (caseId != null) {
            // Update TestRail with the result of this test
            testRail.postTestResult(Integer.parseInt(caseId), testStatus, comment);
        }
    }

    // Method to extract TestRail Case ID from the scenario tags (e.g., @case_123)
    private String getTestRailCaseId(Scenario scenario) {
        for (String tag : scenario.getSourceTagNames()) {
            if (tag.startsWith("@case_")) {
                return tag.replace("@case_", "");
            }
        }
        return null; // Return null if no matching tag found
    }
}

package Testrail;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.OutputStream;

public class TestRailIntegration {

    private static final String TESTRAIL_URL = "https://asahigroupholdings-qa.tmxtestrail.com";
    private static final String USERNAME = "ravirajsinh.solanki@asahigroup-holdings.com";
    private static final String PASSWORD = "asahiqa";  // Note: API key would be more secure to use here
    private static final String PROJECT_ID = "29";     // Your project ID
    private static final String SUITE_ID = "29";       // Suite ID (if used)

    // Method to post the test result to TestRail
    public void postTestResult(String caseId, String status, String comment) {
        try {
            // Correct API endpoint URL
            URL url = new URL(TESTRAIL_URL + "/index.php?/api/v2/add_result_for_case/" + PROJECT_ID + "/" + caseId);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            // Encode username and password for Basic Authentication (TestRail API uses Basic Auth)
            String auth = USERNAME + ":" + PASSWORD;
            String encodedAuth = new String(java.util.Base64.getEncoder().encode(auth.getBytes()));
            connection.setRequestProperty("Authorization", "Basic " + encodedAuth);
            connection.setDoOutput(true);

            // Prepare the JSON body to send
            JSONObject json = new JSONObject();
            json.put("status_id", status.equalsIgnoreCase("passed") ? 1 : 5);  // 1 for Passed, 5 for Failed
            json.put("comment", comment);
            json.put("version", "1.0"); // Optional version field
            json.put("elapsed", "1m");  // Optional elapsed time (example: "1m" for 1 minute)

            // Write JSON data to the request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Check the HTTP response code
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                System.out.println("Test result posted successfully!");
            } else {
                System.out.println("Failed to post test result, HTTP response code: " + code);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

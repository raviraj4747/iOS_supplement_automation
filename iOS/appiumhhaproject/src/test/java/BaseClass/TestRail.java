package BaseClass;

import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;

import java.io.OutputStream;

public class TestRail {

    private static final String TESTRAIL_URL = "https://yourcompany.testrail.io";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password"; // Or use an API Key
    private static final String PROJECT_ID = "1"; // Your TestRail Project ID
    private static final String SUITE_ID = "1"; // Your TestRail Suite ID

    // Method to create a test result in TestRail
    public void postTestResult(int caseId, String status, String comment) {
        try {
            // Prepare the URL and connection
            URL url = new URL(TESTRAIL_URL + "/index.php?/api/v2/add_result_for_case/" + PROJECT_ID + "/" + caseId);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            String auth = USERNAME + ":" + PASSWORD;
            String encodedAuth = new String(java.util.Base64.getEncoder().encode(auth.getBytes()));
            connection.setRequestProperty("Authorization", "Basic " + encodedAuth);
            connection.setDoOutput(true);

            // Prepare the request body
            JSONObject json = new JSONObject();
            json.put("status_id", status.equalsIgnoreCase("passed") ? 1 : 5); // 1 = Passed, 5 = Failed
            json.put("comment", comment);
            json.put("version", "1.0");
            json.put("elapsed", "1m");

            // Write data to request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Send the request and handle response
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                System.out.println("Test result posted successfully!");
            } else {
                System.out.println("Failed to post test result, HTTP response code: " + code);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

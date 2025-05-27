import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        // Create HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Create HTTP request to GitHub API
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com"))
            .build();

        // Send request and get response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print status and body
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}

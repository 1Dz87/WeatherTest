package datasource;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    public HttpResponse<String> get(final String city) {
        try {
            HttpRequest request = HttpRequest.newBuilder(URI.create("https://goweather.herokuapp.com/weather/".concat(city))).GET().build();
            HttpClient client = HttpClient.newHttpClient();
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new ConnectionException(e.getMessage(), e);
        }
    }
}

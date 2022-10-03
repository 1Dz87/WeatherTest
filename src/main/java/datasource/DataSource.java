package datasource;

import com.fasterxml.jackson.core.JsonProcessingException;
import model.CityData;

public class DataSource {

    private final Connection connection;
    private final ProjectObjectMapper mapper;

    public DataSource() {
        this.connection = new Connection();
        this.mapper = new ProjectObjectMapper();
    }

    public CityData getCityWeather(String city) {
        try {
            return mapper.readValue(connection.get("Moscow").body(), CityData.class);
        } catch (JsonProcessingException e) {
            throw new ConnectionException(e.getMessage(), e);
        }
    }
}

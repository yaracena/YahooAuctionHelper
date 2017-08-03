package ie.alancasey;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class YahooAuctionHelperConfiguration extends Configuration {

    @Valid
    @NotNull
    private DataSourceFactory dataSourceFactory = new DataSourceFactory();

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory){
        this.dataSourceFactory = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory(){
        return this.dataSourceFactory;
    }
}

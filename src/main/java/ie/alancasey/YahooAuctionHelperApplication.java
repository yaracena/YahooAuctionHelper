package ie.alancasey;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class YahooAuctionHelperApplication extends Application<YahooAuctionHelperConfiguration> {

    public static void main(final String[] args) throws Exception {
        new YahooAuctionHelperApplication().run(args);
    }

    @Override
    public String getName() {
        return "YahooAuctionHelper";
    }

    @Override
    public void initialize(final Bootstrap<YahooAuctionHelperConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final YahooAuctionHelperConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

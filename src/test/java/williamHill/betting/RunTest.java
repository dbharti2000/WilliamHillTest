package williamHill.betting;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dbharti on 21/03/2017.
 */

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features={"classpath:williamHill.betting/features/PlaceBetOnFootball.feature"},tags={"@PlaceBet"}, strict=true, format = { "pretty",
        "html:target/site/cucumber-pretty","json:target/cucumber.json" })
public class RunTest {
}

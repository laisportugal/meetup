import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

// anotando para o Junit que quero utilizar o Cucumber para rodar os testes
@RunWith(Cucumber.class)

// anotacao para personalizar o console com camel case,  exibe os cenarios em 'pretty' e camelCase
@CucumberOptions(plugin = { "pretty", "html:target/report-html" },
							snippets = SnippetType.CAMELCASE,
							dryRun = false,
							features= "src/test/java")

public class RunnerTest {

}

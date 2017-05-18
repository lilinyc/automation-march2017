package switchCarrier;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Lili on 5/18/2017.
 */
public class SwitchCarrierPage  extends CommonAPI {
    public static final String questionProgressSelector = ".question-steps-progress";

    @FindBy(how = How.CSS, using = "div.step_1.active .question")
    public static WebElement stepOneQuestionElement;

    public String getQuestionOneText() {
        return stepOneQuestionElement.getText();
    }
}

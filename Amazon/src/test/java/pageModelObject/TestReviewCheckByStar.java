package pageModelObject;

import essentialUtility.ReviewCheckByStar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestReviewCheckByStar extends essentialUtility.ReviewCheckByStar {
    @Test
    public void ReviewWithStar4()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReviewCheckByStar star = PageFactory.initElements(driver, ReviewCheckByStar.class);
        star.checkReview4();
    }
    @Test
    public void ReviewWithStar3()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReviewCheckByStar star = PageFactory.initElements(driver, ReviewCheckByStar.class);
        star.checkReview3();
    }
    @Test
    public void ReviewWithStar2()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReviewCheckByStar star = PageFactory.initElements(driver, ReviewCheckByStar.class);
        star.checkReview2();
    }
    @Test
    public void ReviewWithStar1()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReviewCheckByStar star = PageFactory.initElements(driver, ReviewCheckByStar.class);
        star.checkReview1();
    }
}

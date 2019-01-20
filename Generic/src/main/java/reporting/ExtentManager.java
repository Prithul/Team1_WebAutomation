package reporting;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;
<<<<<<< HEAD
=======

>>>>>>> TempDev
import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;
    private static ITestContext context;

<<<<<<< HEAD
    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/ExtentReport.html", true);
            Reporter.log("Extent Report Directory" + resultDirectory, true);
            extent.addSystemInfo("Host Name", "PNT").addSystemInfo("Environment", "QA")
                    .addSystemInfo("User Name", "Amela Dervishi");
            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
=======
    public synchronized static ExtentReports getInstance(){
        if(extent == null){
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(),"html");
            extent = new ExtentReports(System.getProperty("user.dir")+"/Extent-Report/ExtentReport.html", true);
            Reporter.log("Extent Report Directory"+ resultDirectory, true);
            extent.addSystemInfo("Host Name", "PNT_Teamone").addSystemInfo("Environment","QA")
                    .addSystemInfo("User Name", "Teamone");
            extent.loadConfig(new File(System.getProperty("user.dir")+ "/report-config.xml"));
>>>>>>> TempDev
        }
        return extent;
    }

<<<<<<< HEAD
    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;

    }
}
=======
    public static void setOutputDirectory(ITestContext context){
        ExtentManager.context = context;

    }
}
>>>>>>> TempDev

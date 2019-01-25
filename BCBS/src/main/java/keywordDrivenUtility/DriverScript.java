package keywordDrivenUtility;

public class DriverScript {

    public static void testHomePage() throws Exception {

        String sPath = "C:\\Users\\Papri.Barua\\IdeaProjects\\WebAutomationTeam1\\BCBS\\src\\BCBSData.xlsx";
        ReadExcelData.setExcelFile(sPath, "Sheet1");
        for (int iRow=1;iRow<=8;iRow++) {
            String sActions = ReadExcelData.getCellData(iRow, 1);
            if(sActions.equals("openBrowser")) {
                Actions.openBrowser();
            }
            else if(sActions.equals("navigate")) {
                Actions.navigate();
            }
            else if(sActions.equals("verifyHomePageTitle")) {
                Actions.verifyHomePageTitle();
            }
            else if(sActions.equals("verifyHomePageURL")) {
                Actions.verifyHomePageURL();

            }else if(sActions.equals("navigation1")) {
                Actions.navigation1();

            }else if(sActions.equals("navigation2")) {
                Actions.navigation2();

            }else if(sActions.equals("navigation3")) {
                Actions.navigation3();
            }
            else if(sActions.equals("closeBrowser")) {
                Actions.closeBrowser();
            }
        }
    }
}

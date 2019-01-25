package keywordDrivenUtility;

public class DriverScript {

    public static void testSignIn() throws Exception {
        String sPath = "C:\\Users\\Papri.Barua\\IdeaProjects\\WebAutomationTeam1\\Amazon\\src\\AmazonData.xlsx";
        ReadExcelData.setExcelFile(sPath, "Sheet1");
        for (int iRow=1;iRow<=8;iRow++)
         {
            String sActions = ReadExcelData.getCellData(iRow, 1);
            if(sActions.equals("openBrowser")) {
                Actions.openBrowser();
            }
            else if(sActions.equals("navigate")) {
                Actions.navigate();
            }
            else if(sActions.equals("signInPageOpen")) {
                Actions.signInPageOpen();
            }
            else if(sActions.equals("inputUsername")) {
                Actions.inputUsername();
            }
            else if(sActions.equals("inputPassword")) {
                Actions.inputPassword();
            }
            else if(sActions.equals("clickSignIn")) {
                Actions.clickSignIn();
            }
            else if(sActions.equals("verifySignIn")) {
                Actions.verifySignIn();
            }
            else if(sActions.equals("closeBrowser")) {
                Actions.closeBrowser();
            }
        }
    }
}

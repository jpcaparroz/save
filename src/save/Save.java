package save;

public class Save {

    public static void main(String[] args) {
        Save save = new Save();
        save.getAppPage();   
    }

    public void getSelectPage() {
        SelectPage page = new SelectPage();
        page.setVisible(true);
    }

    public void getAppPage() {
        AppPage page = new AppPage();
        page.setVisible(true);
    }

    public void getMoviePage() {
        MoviePage page = new MoviePage();
        page.setVisible(true);
    }
}

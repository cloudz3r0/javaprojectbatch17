package class21;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadUrl(String url);
    abstract void performTesting();
    abstract void close();

}
class ChromeDriver extends WebDriver {
    @Override
    void openBrowser() {
        System.out.println("Opening the Google Chrome Browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading the URL " + url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing testing");
    }

    @Override
    void close() {
        System.out.println("Closing the chrome browser");
    }
}
class FireFoxDriver extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading the URL in FireFox" + url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on firefox");
    }

    @Override
    void close() {
        System.out.println("Closing the browser");
    }
}


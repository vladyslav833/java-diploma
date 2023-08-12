public class Suggest {
    private final String keyWord;
    private final String title;
    private final String url;

    public Suggest(String keyWord, String title, String url) {
        this.keyWord = keyWord;
        this.title = title;
        this.url = url;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}

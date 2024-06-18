package hexlet.code.dto.urls;

import hexlet.code.model.Url;

public class UrlPage {
    private Url url;

    public UrlPage(Url url) {
        this.url = url;
    }

    public Url getUrl() {
        return url;
    }
}

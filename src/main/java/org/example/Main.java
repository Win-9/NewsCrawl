package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105";
            Document doc = Jsoup.connect(url).get();
            Elements newsHeadlines = doc.select("#main_content > div > div._persist > div.section_headline > ul > li > div.sh_text > a");

            // 제목
            for (Element newsHeadline : newsHeadlines) {
                System.out.println(newsHeadline.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
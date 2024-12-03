package Demo4;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

// TODO: 2024/12/4 这个是设计的爬虫，可以爬取图片信息

public class ImageCrawler {

    public static void main(String[] args) {
        String webpageUrl = "https://hanyu.baidu.com/zici/s?wd=%E7%8B%97+++"; // 替换为目标网页
        String saveDirectory = "src/Demo4/image"; // 下载图片的保存路径
        new File(saveDirectory).mkdir(); // 创建保存目录

        try {
            // 1. 获取网页源码
            String htmlSource = getHtmlSource(webpageUrl);

            // 2. 提取图片 URL
            List<String> imageUrls = extractImageUrls(htmlSource);

            // 3. 下载图片
            for (String imageUrl : imageUrls) {
                System.out.println("正在下载图片：" + imageUrl);
                downloadImage(imageUrl, saveDirectory);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取网页源码
    public static String getHtmlSource(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        URL webpage = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) webpage.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // 模拟浏览器请求
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line).append("\n");
        }
        reader.close();
        return result.toString();
    }

    // 提取图片 URL
    public static List<String> extractImageUrls(String htmlSource) {
        List<String> imageUrls = new ArrayList<>();
        String regex = "<img[^>]+src=\"(http[s]?://[^\"]+)\""; // 匹配 <img> 标签的 src 属性
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(htmlSource);
        while (matcher.find()) {
            imageUrls.add(matcher.group(1)); // 获取图片 URL
        }
        return imageUrls;
    }

    // 下载图片
    public static void downloadImage(String imageUrl, String saveDirectory) {
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            connection.connect();

            // 获取图片格式
            String contentType = connection.getContentType(); // e.g., image/jpeg
            String fileExtension = contentType.split("/")[1]; // 提取后缀名
            if (fileExtension.contains("plain")) {
                fileExtension = "jpg"; // 某些图片可能无明确类型，默认为 jpg
            }

            // 生成文件名
            String fileName = "image_" + System.currentTimeMillis() + "." + fileExtension;
            File outputFile = new File(saveDirectory, fileName);

            // 保存图片
            try (InputStream in = connection.getInputStream();
                 OutputStream out = new FileOutputStream(outputFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("图片保存成功：" + outputFile.getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("图片下载失败：" + imageUrl);
            e.printStackTrace();
        }
    }
}

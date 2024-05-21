package com.axing.Util;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectName: test1
 * @package: com.axing.Util
 * @className: DiaryFilter
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/7 下午8:14
 * @version: 1.0
 */
public class DiaryFilter {
    public static void main(String[] args) throws IOException {
        diaryFilter();
    }
    /**
     * @param :
     * @return void
     * @author Axing
     * @description 将日记中所有的 行动指南 过滤出来
     * @date 2024/5/7 下午8:14
     */
    public static void diaryFilter() throws IOException {
        // 导入文件
        File diary = new File("E:\\IDEAProject\\test1\\aaa\\1_日记.md");
        File target = new File("E:\\IDEAProject\\test1\\aaa\\diaryTarget.md");
        // 过滤文件内容
        BufferedReader br = new BufferedReader(new FileReader(diary));
        BufferedWriter bw = new BufferedWriter(new FileWriter(target));
        Pattern compile = Pattern.compile("##\\s*行动指南\\s*((?:\\d+\\.\\s+.+\\n*)+)");
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = br.read()) != -1) {
            sb.append((char) c);
        }
        Matcher matcher = compile.matcher(sb.toString());

        // 遍历追加到新的文件中
        while (matcher.find()) {
            bw.write(matcher.group());
            System.out.println(matcher.group());
        }
        // 关闭流
        bw.close();
        br.close();
    }
}
